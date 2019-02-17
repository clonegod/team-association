# [spotbugs-maven-plugin](https://spotbugs.readthedocs.io/en/latest/maven.html)

	# 检查，如果有，则执行报错
	mvn spotbugs:check
	
	# 如果check不通过，可以通过GUI查看相关bug报告
	mvn spotbugs:gui
	

##

	<plugin>
		  <groupId>com.github.spotbugs</groupId>
		  <artifactId>spotbugs-maven-plugin</artifactId>
		  <version>3.1.10</version>
		  <dependencies>
		    <!-- overwrite dependency on spotbugs if you want to specify the version of spotbugs -->
		    <dependency>
		      <groupId>com.github.spotbugs</groupId>
		      <artifactId>spotbugs</artifactId>
		      <version>3.1.11</version>
		    </dependency>
		  </dependencies>
	</plugin>