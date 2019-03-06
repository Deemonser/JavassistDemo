利用 Javassist 做了一个 OkBus。简化 EvenetBus 的注册 与 注销功能，并将此插件发布到远程 Maven 库，方便使用。
<br>
#### 配置
1. 在项目的 build.gradle 中添加插件
```groovy
buildscript {
    repositories {
        google()
        jcenter()
        maven {
            url "https://plugins.gradle.org/m2/"
        }
    }

    dependencies {
         //...
        classpath "gradle.plugin.com.deemons.gradlePlugin:plugin:1.1.0"
    }
}

```

2. 在 module 中使用插件，并添加对应的依赖
```groovy
apply plugin: "com.deemons.bus"


dependencies {
    compile 'com.deemons.bus:okBus:0.1.0'
}

```
<br>

#### 使用
```java
//在任何地方调用
OkBus.getInstance().onStickyEvent(EventTags.TEST);


    //在目标方法上添加注解
    @Bus(value = EventTags.TEST)
    public void test() {
        Log.d("MainActivity", "test");
    }
```
