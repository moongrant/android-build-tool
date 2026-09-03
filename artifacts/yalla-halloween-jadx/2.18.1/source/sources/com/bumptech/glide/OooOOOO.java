package com.bumptech.glide;

import com.bumptech.glide.OooOOOO;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooOOOO<CHILD extends OooOOOO<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
    public final CHILD OooO0OO() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final Object clone() throws CloneNotSupportedException {
        try {
            return (OooOOOO) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
