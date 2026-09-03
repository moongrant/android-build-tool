package com.yalla.yalla.data.db.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.yalla.yalla.ui.fragment.ContributionFragment;

/* JADX INFO: loaded from: classes4.dex */
@Entity(indices = {@Index(unique = true, value = {ContributionFragment.ARG_1})})
public class RoomTheme {

    @PrimaryKey(autoGenerate = true)
    public Integer id;

    @ColumnInfo(name = ContributionFragment.ARG_1)
    public long roomId;

    @ColumnInfo(name = "roomTheme")
    public String roomTheme;
}
