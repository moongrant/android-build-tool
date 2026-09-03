package o00OO0O0;

import com.airbnb.lottie.model.content.Mask;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f37262OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList f37263OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<Mask> f37264OooO0OO;

    public OooOOO0(List<Mask> list) {
        this.f37264OooO0OO = list;
        this.f37262OooO00o = new ArrayList(list.size());
        this.f37263OooO0O0 = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f37262OooO00o.add(list.get(i).f11863OooO0O0.OooO00o());
            this.f37263OooO0O0.add(list.get(i).f11864OooO0OO.OooO00o());
        }
    }
}
