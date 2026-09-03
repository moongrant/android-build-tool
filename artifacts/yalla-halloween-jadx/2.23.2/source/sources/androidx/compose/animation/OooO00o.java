package androidx.compose.animation;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import androidx.media3.common.DeviceInfo;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.fragment.ExploreTagRoomListFragment;
import p080o000OoO.o00Oo0;
import p248o00oo0o0.o000OO00;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements androidx.media3.common.OooO0OO.OooO00o, BaseQuickAdapter.OooO0O0, o000OO00.OooO00o {
    public static String OooO00o(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0O0
    public void OooO0O0(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        ExploreTagRoomListFragment.initView$lambda$2(baseQuickAdapter, view, i);
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public androidx.media3.common.OooO0OO OooO0OO(Bundle bundle) {
        int i = bundle.getInt(DeviceInfo.f6211OooO, 0);
        int i2 = bundle.getInt(DeviceInfo.f6213OooOO0, 0);
        int i3 = bundle.getInt(DeviceInfo.f6214OooOO0O, 0);
        String string = bundle.getString(DeviceInfo.f6215OooOO0o);
        DeviceInfo.OooO00o oooO00o = new DeviceInfo.OooO00o(i);
        oooO00o.f6222OooO0O0 = i2;
        oooO00o.f6223OooO0OO = i3;
        o00Oo0.OooO00o(i != 0 || string == null);
        oooO00o.f6224OooO0Oo = string;
        return oooO00o.OooO00o();
    }

    @Override // o00oo0o0.o000OO00.OooO00o
    public Object apply(Object obj) {
        return Boolean.valueOf(((Cursor) obj).getCount() > 0);
    }
}
