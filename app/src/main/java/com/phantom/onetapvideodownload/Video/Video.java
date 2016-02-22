package com.phantom.onetapvideodownload.Video;

import android.content.Context;

import com.phantom.onetapvideodownload.downloader.DownloadOptionItem;

import java.util.List;

public interface Video {
    String getUrl();
    String getTitle();
    long getDatabaseId();
    void setDatabaseId(long databaseId);
    List<DownloadOptionItem> getOptions();
    void setContext(Context context);
}
