SSH:第一个版本 纯xml的整合,保留springstruts2和hibernate各自的主配置文件
	整合步骤:
	第一步:保留spring的ioc容器能在web工程中独立运行
	第二步:保证hibernate框架能够在web工程中独立运行
	第三步:整合spring和hibernate
		思考:怎么才算是整合了
		spring接管了hibernateFactory对象创建(把SessionFactory存入spring容器中)
		使用了spring的声明式事务控制
	第四步:保证struts2框架能够在web工程中独立运行
	第五步:整合spring和struts2
		思考:怎么才算struts2和spring整合到一起?
			action的创建交给spring来管理
			保证web工程中的容器只有一个
	第六步:优化已有的整合配置
		配置文件的位置可以调整
		配置文件的内容可以分不同的文件来编写