package o000000O;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f33767OooO00o = -1;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f33768OooO0O0 = -1;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f33769OooO0OO = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public HashMap<String, ConstraintAttribute> f33770OooO0Oo;

    public static float OooO0oO(Number number) {
        return number instanceof Float ? ((Float) number).floatValue() : Float.parseFloat(number.toString());
    }

    public abstract void OooO00o(HashMap<String, o000000.OooO0o> map);

    @Override // 
    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public abstract OooO0o clone();

    public OooO0o OooO0OO(OooO0o oooO0o) {
        this.f33767OooO00o = oooO0o.f33767OooO00o;
        this.f33768OooO0O0 = oooO0o.f33768OooO0O0;
        this.f33769OooO0OO = oooO0o.f33769OooO0OO;
        this.f33770OooO0Oo = oooO0o.f33770OooO0Oo;
        return this;
    }

    public abstract void OooO0Oo(HashSet<String> hashSet);

    public void OooO0o(HashMap<String, Integer> map) {
    }

    public abstract void OooO0o0(Context context, AttributeSet attributeSet);
}
