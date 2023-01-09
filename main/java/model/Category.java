package model;

public class Category {
    private String CategoryName;
    private String CategoryDesc;
    public Category(String categoryName2, String categoryDes) {
		// TODO Auto-generated constructor stub
    	this.CategoryName=categoryName2;
    	this.CategoryDesc=categoryDes;
	}
	public String getCategoryName() {
        return CategoryName;
    }
    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }
    public String getCategoryDesc() {
        return CategoryDesc;
    }
    public void setCategoryDesc(String categoryDesc) {
        CategoryDesc = categoryDesc;
    }
}