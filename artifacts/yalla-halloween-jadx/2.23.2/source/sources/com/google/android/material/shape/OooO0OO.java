package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO extends OooO0o.OooOO0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ List f17174OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Matrix f17175OooO0Oo;

    public OooO0OO(ArrayList arrayList, Matrix matrix) {
        this.f17174OooO0OO = arrayList;
        this.f17175OooO0Oo = matrix;
    }

    @Override // com.google.android.material.shape.OooO0o.OooOO0
    public final void OooO00o(Matrix matrix, o0O00o00.OooO00o oooO00o, int i, Canvas canvas) {
        Iterator it = this.f17174OooO0OO.iterator();
        while (it.hasNext()) {
            ((OooO0o.OooOO0) it.next()).OooO00o(this.f17175OooO0Oo, oooO00o, i, canvas);
        }
    }
}
