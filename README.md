# C3p0-Demo
用C3p0连接池实战   
step1:使用api(c3p0-0.9.1.2.jar)  
step2:  
  * 方法一：硬编码方法（不推荐）  
    new ComoPooledDataSource()+参数配置  
  * 方法二：配置文件方法（掌握）  
    配置文件的名称：c3p0.properties 或者 c3p0-config.xml  
    配置文件的路径：src/ 下  
    编码只需要写一句话 new ComPooledDataSource()  
    
    方法2-1：默认的配置(用c3p0.properties 或者 c3p0-config.xml)
      new ComPooledDataSource()
    方法2-2：使用命名的配置(用c3p0-config.xml)
      需要更改文件中的<命名的配置>模块中的
      <named-config name="itcast">中的参数，然后
      new ComboPooledDataSource(String configName)

