## springboot mybatis mapper Demo
 
###  使用mybatis generator插件生成代码 和 Mapper(tk.mybatis)创建通用的代码

#### pom依赖
```xml
<!--mybatis starter-->
<dependency>
    <groupId>org.mybatis.spring.boot</groupId>
    <artifactId>mybatis-spring-boot-starter</artifactId>
    <version>${mybatis.starter.version}</version>
</dependency>
<!--mapper-->
<dependency>
    <groupId>tk.mybatis</groupId>
    <artifactId>mapper-spring-boot-starter</artifactId>
    <version>${tk.mybatis.starter.version}</version>
</dependency>
<!--pagehelper-->
<dependency>
    <groupId>com.github.pagehelper</groupId>
    <artifactId>pagehelper-spring-boot-starter</artifactId>
    <version>${pagehelper.version}</version>
</dependency>
```
#### 插件配置
```xml
...
<plugin>
    <groupId>org.mybatis.generator</groupId>
    <artifactId>mybatis-generator-maven-plugin</artifactId>
    <version>1.3.2</version>
    <configuration>
        <configurationFile>${basedir}/src/main/resources/generator/generatorConfig.xml</configurationFile>
        <overwrite>true</overwrite>
        <verbose>true</verbose>
    </configuration>
    <dependencies>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>${mysql.version}</version>
        </dependency>
        <dependency>
            <groupId>tk.mybatis</groupId>
            <artifactId>mapper</artifactId>
            <version>3.3.9</version>
        </dependency>
        <dependency>
            <groupId>com.ml</groupId>
            <artifactId>mybatis-generator-plugin</artifactId>
            <version>0.0.1-SNAPSHOT</version>
        </dependency>
    </dependencies>
</plugin>
...
```

###  自定义生成插件的使用（生成model自带Lombok注解，不要set和get方法）
自定义插件编写： mybatisgeneratorplugin
maven plugin 配置
```xml
<dependency>
    <groupId>com.ml</groupId>
    <artifactId>mybatis-generator-plugin</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>
```
generatorConfig.xml配置
```xml
<plugin type="com.ml.mybatisgeneratorplugin.LombokPlugin">
    <!-- enable annotations -->
    <property name="builder" value="true"/>
    <property name="allArgsConstructor" value="false"/>
</plugin>
```

###  执行生成命令

```
mvn mybatis-generator:generate
```