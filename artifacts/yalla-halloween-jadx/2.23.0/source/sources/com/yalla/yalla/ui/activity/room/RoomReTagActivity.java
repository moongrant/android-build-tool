package com.yalla.yalla.ui.activity.room;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.yalla.yalla.app.golbalData.ApiTagUtils;
import com.yalla.yalla.base.abs.AbsListener.AbsListenerTag;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.mixedroom.model.RoomConfiguration;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public class RoomReTagActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final /* synthetic */ int f26640OooOo00 = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public ListView f26641OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public p505o0o00oo0.OooOo00 f26642OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public RoomConfiguration f26643OooOOoo;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f26644OooO00o;

        static {
            int[] iArr = new int[AbsListenerTag.values().length];
            f26644OooO00o = iArr;
            try {
                iArr[AbsListenerTag.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(oO00OO0O.activity_room_re_tag);
        if (getIntent() == null) {
            finish();
        } else {
            this.f26643OooOOoo = (RoomConfiguration) getIntent().getSerializableExtra("Module");
        }
        this.f22755OooOO0.setTitle(oO00OOo0.createBar_txt_Category);
        this.f26641OooOOo = (ListView) findViewById(oO00O0oO.activity_room_re_tag_listview);
        p505o0o00oo0.OooOo00 oooOo00 = new p505o0o00oo0.OooOo00(this);
        this.f26642OooOOo0 = oooOo00;
        oooOo00.f44409OooO0Oo = new oo0o0O0(this);
        this.f26641OooOOo.setAdapter((ListAdapter) oooOo00);
        this.f26642OooOOo0.OooO0o0(ApiTagUtils.f22722OooO0O0);
        ApiTagUtils.OooO0O0();
    }
}
