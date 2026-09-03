package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO extends OooO0o.OooOO0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ List f17651OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Matrix f17652OooO0Oo;

    public OooO0OO(ArrayList arrayList, Matrix matrix) {
        this.f17651OooO0OO = arrayList;
        this.f17652OooO0Oo = matrix;
    }

    @Override // com.google.android.material.shape.OooO0o.OooOO0
    public final void OooO00o(Matrix matrix, p275o0O00Ooo.OooO0o oooO0o, int i, Canvas canvas) {
        Iterator it = this.f17651OooO0OO.iterator();
        while (it.hasNext()) {
            ((OooO0o.OooOO0) it.next()).OooO00o(this.f17652OooO0Oo, oooO0o, i, canvas);
        }
    }
}
