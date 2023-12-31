package businesstier.transferobject;
// Generated May 25, 2023, 11:51:25 p.m. by Hibernate Tools 6.1.7.Final

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Language generated by hbm2java
 */
public class Language implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private String id;
	private String title;
	private Timestamp lastUpdated;
	private Set<LanguageTranslation> languageTranslations = new HashSet<LanguageTranslation>(0);

	public Language() {
	}

	public Language(String id, String title) {
		this.id = id;
		this.title = title;
	}

	public Language(String id, String title, Timestamp lastUpdated, Set<LanguageTranslation> languageTranslations) {
		this.id = id;
		this.title = title;
		this.lastUpdated = lastUpdated;
		this.languageTranslations = languageTranslations;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Timestamp getLastUpdated() {
		return this.lastUpdated;
	}
	
	public void setLastUpdated(Timestamp lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public Set<LanguageTranslation> getLanguageTranslations() {
		return this.languageTranslations;
	}

	public void setLanguageTranslations(Set<LanguageTranslation> languageTranslations) {
		this.languageTranslations = languageTranslations;
	}

}
