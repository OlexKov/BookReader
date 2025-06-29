package com.example.bookreader.data.database.entity;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity(tableName = "books",
        foreignKeys = @ForeignKey(
        entity = Category.class,
        parentColumns = "id",
        childColumns = "categoryId",
        onDelete = ForeignKey.SET_NULL
))


@NoArgsConstructor                // Потрібен Room для створення через рефлексію
@AllArgsConstructor              // Повний конструктор, якщо треба вручну створювати
@Builder                         // Додає патерн Builder
public class Book implements Serializable {
    @PrimaryKey(autoGenerate = true)
    public long id;

    public String name;

    public Long categoryId = null;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(id);
    }
}
