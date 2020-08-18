import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {

    @JsonProperty("all")
    private List<CatCatcher> cats;

    public List<CatCatcher> getAll() {
        return cats;
    }

    public void setAll(List<CatCatcher> cat) {
        this.cats = cat;
    }

    @Override
    public String toString() {
        return "Test{" +
                "all=" + cats +
                '}';
    }
}
