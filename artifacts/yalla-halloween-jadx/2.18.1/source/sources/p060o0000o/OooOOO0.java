package p060o0000o;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.util.HashMap;
import java.util.HashSet;
import p063o0000o0o.oo0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f27684OooO00o = -1;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f27685OooO0O0 = -1;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f27686OooO0OO = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public HashMap<String, ConstraintAttribute> f27687OooO0Oo;

    public abstract void OooO00o(HashMap<String, oo0o0Oo> map);

    @Override // 
    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public abstract OooOOO0 clone();

    public OooOOO0 OooO0OO(OooOOO0 oooOOO0) {
        this.f27684OooO00o = oooOOO0.f27684OooO00o;
        this.f27685OooO0O0 = oooOOO0.f27685OooO0O0;
        this.f27686OooO0OO = oooOOO0.f27686OooO0OO;
        this.f27687OooO0Oo = oooOOO0.f27687OooO0Oo;
        return this;
    }

    public abstract void OooO0Oo(HashSet<String> hashSet);

    public void OooO0o(HashMap<String, Integer> map) {
    }

    public abstract void OooO0o0(Context context, AttributeSet attributeSet);

    public final float OooO0oO(Object obj) {
        return obj instanceof Float ? ((Float) obj).floatValue() : Float.parseFloat(obj.toString());
    }
}
