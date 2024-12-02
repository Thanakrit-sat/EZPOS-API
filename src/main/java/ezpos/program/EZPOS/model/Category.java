package ezpos.program.EZPOS.model;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private String name;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "category_id")
    @Column(nullable = true)
    private ArrayList<AddOnItem> addOnItems = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<AddOnItem> getAddOnItems() {
        return addOnItems;
    }

    public void setAddOnItems(ArrayList<AddOnItem> addOnItems) {
        this.addOnItems = addOnItems;
    }
}
