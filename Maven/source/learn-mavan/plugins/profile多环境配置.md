## profiles的应用

> 首先，通过profiles定义多套环境的配置，每个profile管理一个环境下的参数配置，通过id来标识。

> profile 标签下的 id 用来定义环境的唯一标识，mvn 打包时通过-P参数进行指定。比如，mvn install -Pprod， 表示要打生产包。

> profile 标签下的 properties属性，可以自定义变量属性，这些属性可以用来对资源文件中的占位符进行替换。


# src/main/resources 下的资源文件，包含需要被替换的变量（根据profile替换为不同的值）
application.properties

	# env变量将根据mvn打包时所指定的profile下的变量进行替换
	spring.profiles.active=@env@


# resource 插件，开启filter功能
	<resources>
            <resource>
            	<directory>src/main/resources</directory>
            	<includes>
            		<include>*.properties</include>
            		<include>*.xml</include>
            	</includes>
            	<filtering>true</filtering>
            </resource>
            <resource>
            	<directory>src/main/resources/${env}</directory>
            	<includes>
            		<include>**/*.properties</include>
            		<include>**/*.xml</include>
            	</includes>
            	<filtering>true</filtering>
            </resource>
        </resources>

# <!-- 多环境配置 -->
	<profiles>
		<!-- 开发环境 -->
		<profile>
			<id>dev</id>
			<properties>
				<env>dev</env>
				<swagger.enable>true</swagger.enable>
			</properties>
			<activation>
				<activeByDefault>true</activeByDefault>
			</activation>
		</profile>
		 <!--测试环境 -->
		<profile>
			<id>test</id>
			<properties>
				<env>test</env>
				<swagger.enable>true</swagger.enable>
			</properties>
		</profile>
		 <!-- 生产环境 -->
		<profile>
			<id>prod</id>
			<properties>
				<env>prod</env>
				<swagger.enable>false</swagger.enable>
			</properties>
		</profile>
	</profiles>
	

# 开发环境打包：mvn clean install -Pdev

# 测试环境打包：mvn clean install -Ptest 

# 生产环境打包：mvn clean install -Pprod


