package p293o0O0OoO0;

import java.io.File;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOO0O implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String name = ((File) obj).getName();
        int i = OooOOOO.f41688OooO0o0;
        return name.substring(0, i).compareTo(((File) obj2).getName().substring(0, i));
    }
}
