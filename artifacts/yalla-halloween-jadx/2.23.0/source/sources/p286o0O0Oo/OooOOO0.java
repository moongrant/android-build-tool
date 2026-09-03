package p286o0O0Oo;

import java.io.File;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOOO0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String name = ((File) obj).getName();
        int i = OooOOOO.f42235OooO0o0;
        return name.substring(0, i).compareTo(((File) obj2).getName().substring(0, i));
    }
}
