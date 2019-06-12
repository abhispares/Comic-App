package com.example.comicbox.Interface;

import com.example.comicbox.Model.Comic;

import java.util.List;

public interface IComicLoadDone {
    void onComicLoadDoneListener(List<Comic> comicList);
}
