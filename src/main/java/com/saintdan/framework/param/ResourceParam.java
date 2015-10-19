package com.saintdan.framework.param;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Resource RESTFul param bean.
 *
 * @author <a href="http://github.com/saintdan">Liao Yifan</a>
 * @date 10/16/15
 * @since JDK1.8
 */
public class ResourceParam extends BaseParam implements Serializable {

    private static final long serialVersionUID = 8542867394907970893L;

    private Long id; // role's ID.

    private String name; // role's name

    private String path;

    private Integer priority;

    private String description;

    private Set<Long> groupIds = new HashSet<>(); // role ids

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Long> getGroupIds() {
        return groupIds;
    }

    public void setGroupIds(Set<Long> groupIds) {
        this.groupIds = groupIds;
    }
}