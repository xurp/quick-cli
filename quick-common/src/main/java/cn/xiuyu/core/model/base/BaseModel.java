package cn.xiuyu.core.model.base;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

// [注]:@MappedSuperclass将实体类当成基类实体，它不会隐射到数据库表，但继承它的子类实体在隐射时会自动扫描该基类实体的隐射属性，添加到子类实体的对应数据库表中。
@MappedSuperclass
public class BaseModel implements Serializable {

    private static final long serialVersionUID = 9007117085349104906L;

    // 创建时间
    @Column(name = "create_time")
    private Date createTime;

    // 修改时间
    @Column(name = "modify_time")
    private Date modifyTime;

    // 创建人
    @Column(name = "create_manager")
    private String createManager;

    // 修改人
    @Column(name = "modify_anager")
    private String modifyManager;

    // 备注
    @Column(name = "remake")
    private String remake;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getCreateManager() {
        return createManager;
    }

    public void setCreateManager(String createManager) {
        this.createManager = createManager;
    }

    public String getModifyManager() {
        return modifyManager;
    }

    public void setModifyManager(String modifyManager) {
        this.modifyManager = modifyManager;
    }

    public String getRemake() {
        return remake;
    }

    public void setRemake(String remake) {
        this.remake = remake;
    }

    public BaseModel() {
        super();
    }

}
