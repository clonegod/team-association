# checkstyle + jxr 生成样式报告（规范项目代码的格式）

	# 第1步，对src/main/java下的源代码进行检查，结果以HTML文件输出	
	mvn checkstyle:check  // 有问题，会报错
	mvn checkstyle:checkstyle	// 有问题，不会报错
	
	# 第2步，生成可在checkstyle结果页面上链接到java源代码
	mvn jxr:jxr

	# 最后，查看target目录下生成的报告
	taget/site/checkstyle.html
	
# 插件	

	<properties>
		<maven.checkstyle.version>2.17</maven.checkstyle.version>
		<maven.jxr.version>3.0.0</maven.jxr.version>
	</properties>

	<reporting>
	
		<!-- checkstyle + jxr 生成样式报告 -->
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-checkstyle-plugin</artifactId>
				<version>${maven.checkstyle.version}</version>
			</plugin>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-jxr-plugin</artifactId>
				<version>${maven.jxr.version}</version>
			</plugin>
		</plugins>
		<!-- end -->
		
	</reporting>
