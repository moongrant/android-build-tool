package com.yalla.yalla.model;

import com.yalla.yalla.model.bean.AbsJavaBeanApi;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class TopExploreModel extends AbsJavaBeanApi {
    public TopRankHeaderModel dayData;
    public TopRankHeaderModel hourData;
    public TopRankHeaderModel monthData;
    public TopRankHeaderModel weekData;
    public List<List<RankModel2>> room = new ArrayList();
    public List<List<RankModel2>> giftSend = new ArrayList();
    public List<List<RankModel2>> giftReceived = new ArrayList();
    public List<List<RankModel2>> total = new ArrayList();
}
