package com.pojo;

import java.util.Collection;

/**
 * Created by Admin on 2016/6/27.
 */

/**
 * Category类 表达视频分类的实体类（基于JavaBean概念）
 * <p>
 *     Category私有成员<br>
 *     categoryName     视频分类的名称，描述视频分类的基本属性<br>
 * </p>
 */
public class Category {
    private String categoryName;
    private Collection<Subcategory> subcategoriesByCategoryName;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (categoryName != null ? !categoryName.equals(category.categoryName) : category.categoryName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        return categoryName != null ? categoryName.hashCode() : 0;
    }

    public Collection<Subcategory> getSubcategoriesByCategoryName() {
        return subcategoriesByCategoryName;
    }

    public void setSubcategoriesByCategoryName(Collection<Subcategory> subcategoriesByCategoryName) {
        this.subcategoriesByCategoryName = subcategoriesByCategoryName;
    }
}
