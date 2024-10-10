package com.jeremi.bookshelfapi.models.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.type.TrueFalseConverter;

import java.io.Serializable;
import java.lang.annotation.Documented;
import java.util.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "books")
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotEmpty(message = "Field nama is required")
    @Column(length = 100)
    private String name;

    @NotNull(message = "Field year is required")
    @Column(name = "year")
    private Integer year;

    @NotEmpty(message = "Field author is required")
    @Column(name = "author")
    private String author;

    @NotEmpty(message = "Field summary is required")
    @Column(name = "summary")
    private String summary;

    @NotEmpty(message = "Field publisher is required")
    @Column(name = "publisher")
    private String publisher;

    @NotNull(message = "Field pageCount is required")
    @Column(name = "pageCount")
    private Integer pageCount;

    @NotNull(message = "Field readPage is required")
    @Column(name = "readPage")
    private Integer readPage;

    @Column(name = "finished")
    @Convert(converter = TrueFalseConverter.class)
    private boolean finished = false;

    @NotNull
    @Column(name = "reading")
    @Convert(converter = TrueFalseConverter.class)
    private boolean reading;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "createdAt", nullable = false, updatable = false)
    private Date createdAt;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updateAt", nullable = false)
    private Date updateAt;

    public Book(UUID id, String name, Integer year, String author, String summary, String publisher, Integer pageCount, Integer readPage, boolean finished, boolean reading) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.author = author;
        this.summary = summary;
        this.publisher = publisher;
        this.pageCount = pageCount;
        this.readPage = readPage;
        this.finished = finished;
        this.reading = reading;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", author='" + author + '\'' +
                ", summary='" + summary + '\'' +
                ", publisher='" + publisher + '\'' +
                ", pageCount=" + pageCount +
                ", readPage=" + readPage +
                ", finished=" + finished +
                ", reading=" + reading +
                ", insertAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getReadPage() {
        return readPage;
    }

    public void setReadPage(Integer readPage) {
        this.readPage = readPage;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public boolean isReading() {
        return reading;
    }

    public void setReading(boolean reading) {
        this.reading = reading;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}
