package androidx.compose.animation;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import androidx.media3.common.Player;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000oOoO implements androidx.media3.common.OooO0OO.OooO00o {
    public static String OooO00o(StringBuilder sb, long j, char c) {
        sb.append(j);
        sb.append(c);
        return sb.toString();
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public androidx.media3.common.OooO0OO OooO0OO(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(Player.OooO00o.f6700OooO0o);
        if (integerArrayList == null) {
            return Player.OooO00o.f6701OooO0o0;
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i = 0; i < integerArrayList.size(); i++) {
            sparseBooleanArray.append(integerArrayList.get(i).intValue(), true);
        }
        return new Player.OooO00o(new androidx.media3.common.OooO(sparseBooleanArray));
    }
}
