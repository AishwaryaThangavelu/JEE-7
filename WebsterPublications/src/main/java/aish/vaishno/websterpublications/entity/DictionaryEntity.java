/*
 */

package aish.vaishno.websterpublications.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author aishwarya
 */
@Entity
@Table(name = "WP_DICTIONARY")
public class DictionaryEntity {
    
    @Id
    @GeneratedValue
    private Long id;

    @NotNull(message = "Enter a word")
    private String word;
    
    @NotNull(message = "Enter the word's meaning")
    private String meaning;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    @Override
    public String toString() {
        return "DictionaryEntity{" + "id=" + id + ", word=" + word + ", meaning=" + meaning + '}';
    }
}
