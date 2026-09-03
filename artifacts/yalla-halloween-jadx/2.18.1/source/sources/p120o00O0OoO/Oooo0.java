package p120o00O0OoO;

import android.graphics.Path;
import com.airbnb.lottie.model.content.Mask;
import java.util.ArrayList;
import java.util.List;
import p125o00O0o0O.o00000O;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<OooOO0O<o00000O, Path>> f30788OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<OooOO0O<Integer, Integer>> f30789OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<Mask> f30790OooO0OO;

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList, java.util.List<o00O0OoO.OooOO0O<o00O0o0O.o00000O, android.graphics.Path>>] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList, java.util.List<o00O0OoO.OooOO0O<java.lang.Integer, java.lang.Integer>>] */
    public Oooo0(List<Mask> list) {
        this.f30790OooO0OO = list;
        this.f30788OooO00o = new ArrayList(list.size());
        this.f30789OooO0O0 = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f30788OooO00o.add(list.get(i).f10092OooO0O0.OooO00o());
            this.f30789OooO0O0.add(list.get(i).f10093OooO0OO.OooO00o());
        }
    }
}
