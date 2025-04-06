#include <linux/module.h>
#include <linux/kernel.h>

// 定义设备驱动接口
struct device_driver {
    void (*init)(void);
    void (*exit)(void);
};

// 具体的设备驱动实现
static struct device_driver driver1 = {
    .init = driver1_init,
    .exit = driver1_exit
};

static struct device_driver driver2 = {
    .init = driver2_init,
    .exit = driver2_exit
};

// 设备驱动工厂函数
struct device_driver* create_driver(int type)
{
    switch (type) {
    case 1:
        return &driver1;
    case 2:
        return &driver2;
    default:
        return NULL;
    }
}

// 模块初始化
static int __init my_module_init(void)
{
    struct device_driver* driver = create_driver(1);
    if (driver) {
        driver->init();
    }
    return 0;
}

// 模块退出
static void __exit my_module_exit(void)
{
    struct device_driver* driver = create_driver(1);
    if (driver) {
        driver->exit();
    }
}

module_init(my_module_init);
module_exit(my_module_exit);
MODULE_LICENSE("GPL");