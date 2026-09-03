package androidx.media3.session;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import androidx.media3.common.Player;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0O00;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class o0000OO0 implements o000oOoO.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o00O00O f9295OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public oo00o f9296OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Player.OooO00o f9297OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public OooOOO0 f9298OooO0Oo;

    public static Player.OooO00o OooO0OO(Player.OooO00o oooO00o, Player.OooO00o oooO00o2) {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        p080o000OoO.o00Oo0.OooO0Oo(!false);
        sparseBooleanArray.append(32, true);
        for (int i = 0; i < oooO00o.f6703OooO0Oo.OooO0OO(); i++) {
            androidx.media3.common.OooO oooO = oooO00o.f6703OooO0Oo;
            if (oooO00o2.OooO0OO(oooO.OooO0O0(i))) {
                int iOooO0O0 = oooO.OooO0O0(i);
                p080o000OoO.o00Oo0.OooO0Oo(!false);
                sparseBooleanArray.append(iOooO0O0, true);
            }
        }
        p080o000OoO.o00Oo0.OooO0Oo(!false);
        return new Player.OooO00o(new androidx.media3.common.OooO(sparseBooleanArray));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    public static o0O00 OooO0Oo(List list, Player.OooO00o oooO00o, oo00o oo00oVar) {
        boolean z;
        int i;
        ImmutableList.OooO00o oooO00o2 = new ImmutableList.OooO00o();
        for (int i2 = 0; i2 < list.size(); i2++) {
            OooO0O0 oooO0O0 = (OooO0O0) list.get(i2);
            if (oooO00o.OooO0OO(oooO0O0.f9244OooO0o0)) {
                z = true;
            } else {
                SessionCommand sessionCommand = oooO0O0.f9242OooO0Oo;
                if (sessionCommand != null) {
                    oo00oVar.getClass();
                    if (oo00oVar.f9498OooO0Oo.contains(sessionCommand)) {
                        z = true;
                    } else {
                        i = oooO0O0.f9244OooO0o0;
                        if (i == -1 && oo00oVar.OooO0OO(i)) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                } else {
                    i = oooO0O0.f9244OooO0o0;
                    if (i == -1) {
                    }
                    z = false;
                }
            }
            if (oooO0O0.f9241OooO != z) {
                oooO0O0 = new OooO0O0(oooO0O0.f9242OooO0Oo, oooO0O0.f9244OooO0o0, oooO0O0.f9243OooO0o, oooO0O0.f9245OooO0oO, new Bundle(oooO0O0.f9246OooO0oo), z);
            }
            oooO00o2.OooO0OO(oooO0O0);
        }
        return oooO00o2.OooO0oo();
    }

    public final boolean OooO0o() {
        throw null;
    }

    public o000oOoO OooO0o0() {
        throw null;
    }
}
