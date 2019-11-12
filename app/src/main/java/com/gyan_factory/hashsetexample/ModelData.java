package com.gyan_factory.hashsetexample;

import android.os.Build;

import java.util.Objects;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class ModelData {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public ModelData(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int id;
    private String name;

    @Override
    public boolean equals(@Nullable Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ModelData modelData = (ModelData) obj;
        return name == modelData.name;
    }

    @Override
    public String toString() {
        return "ModelData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
