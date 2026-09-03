package com.yalla.yalla.ui.view.round;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yalla/yalla/ui/view/round/DisplayType;", "", "", "type", "I", "getType", "()I", "NORMAL", "CIRCLE", "ROUND_RECT", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public enum DisplayType {
    NORMAL(0),
    CIRCLE(1),
    ROUND_RECT(2);

    private final int type;

    DisplayType(int i) {
        this.type = i;
    }
}
