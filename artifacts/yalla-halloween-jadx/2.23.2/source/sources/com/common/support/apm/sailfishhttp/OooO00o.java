package com.common.support.apm.sailfishhttp;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OooO00o implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return HeaderUtil.m4026sortParams$lambda1$lambda0((Map.Entry) obj, (Map.Entry) obj2);
    }
}
