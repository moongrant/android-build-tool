package androidx.compose.ui.text.android;

import java.io.File;
import java.nio.charset.Charset;
import java.util.Comparator;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0o implements Comparator {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f4185OooO0Oo;

    public /* synthetic */ OooO0o(int i) {
        this.f4185OooO0Oo = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f4185OooO0Oo) {
            case 0:
                return LayoutIntrinsicsKt.minIntrinsicWidth$lambda$0((Pair) obj, (Pair) obj2);
            default:
                Charset charset = p286o0O0Oo.OooOOOO.f42233OooO0Oo;
                return ((File) obj2).getName().compareTo(((File) obj).getName());
        }
    }
}
