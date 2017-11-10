package by.htp.rentstation;

public abstract class Equipment {
	
	private Category category;
	private String title;
	private int cost;
	
	public Equipment(Category category, String title, int cost) {
		super();
		this.category = category;
		this.title = title;
		this.cost = cost;
	}

	public Category getCategory() {
		return category;
	}

	public String getTitle() {
		return title;
	}

	public int getCost() {
		return cost;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + cost;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipment other = (Equipment) obj;
		if (category != other.category)
			return false;
		if (cost != other.cost)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
		
}
