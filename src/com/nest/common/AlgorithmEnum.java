package com.nest.common;

/**
 * 算法ID及信息枚举
 *
 * @author Zp
 * @version v1.0
 * @date 2018/3/20
 */
public enum AlgorithmEnum {

    UNDEFINE("0", "未定义"),
    EXAMPLE("9", "示例");

    private String algorithmId;

    private String algorithmInfo;

    AlgorithmEnum(String algorithmId, String algorithmInfo) {
        this.algorithmId = algorithmId;
        this.algorithmInfo = algorithmInfo;
    }

    public static AlgorithmEnum selectByID(String id){
        for (AlgorithmEnum algorithmEnum: values()) {
            if(algorithmEnum.getAlgorithmId().equals(id)){
                return algorithmEnum;
            }
        }
        return AlgorithmEnum.UNDEFINE;
    }

    public String getAlgorithmId() {
        return algorithmId;
    }

    public void setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
    }

    public String getAlgorithmInfo() {
        return algorithmInfo;
    }

    public void setAlgorithmInfo(String algorithmInfo) {
        this.algorithmInfo = algorithmInfo;
    }
}
