package o0000OOO;

import android.content.Context;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO0OO extends OooO00o {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int f34134OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final int f34135OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final LayoutInflater f34136OooOOO0;

    @Deprecated
    public OooO0OO(Context context, int i) {
        super(context);
        this.f34135OooOO0o = i;
        this.f34134OooOO0O = i;
        this.f34136OooOOO0 = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
