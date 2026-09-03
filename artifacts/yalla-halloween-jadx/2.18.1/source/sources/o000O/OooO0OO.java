package o000O;

import android.content.Context;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO0OO extends OooO00o {

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public int f28038OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public LayoutInflater f28039OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public int f28040o000oOoO;

    @Deprecated
    public OooO0OO(Context context, int i) {
        super(context);
        this.f28040o000oOoO = i;
        this.f28038OoooOO0 = i;
        this.f28039OoooOOO = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
