# vehicle-drone-scheduler
simulator for vehicle-drone cooperative routing and scheduling
# 目录说明
## algorithm
算法包，包含算法类，例如聚类算法、TSP算法等
## common
公共包，包含基本类，例如线、点、聚类接口等
## fixation
位置固定的实例类，包含客户、停靠点等
## movement
可移动的实例类，包含货车、无人机等
# 开发说明
所有的公共部分分别在algorithm,fixation,movement等package的根目录中中，每个项目如果要对公共实例类进行扩展，则在相应的目录中新建各自项目的package（如my_project）