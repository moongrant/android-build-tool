package com.yalla.yalla.ui.activity.room;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.yalla.yalla.app.golbalData.ApiTagUtils;
import com.yalla.yalla.base.abs.AbsListener.AbsListenerTag;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.mixedroom.model.RoomConfiguration;

/* JADX INFO: loaded from: classes4.dex */
public class RoomReTagActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final /* synthetic */ int f26186OooOo00 = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public ListView f26187OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public p514o0o0O000.OooO0OO f26188OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public RoomConfiguration f26189OooOOoo;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f26190OooO00o;

        static {
            int[] iArr = new int[AbsListenerTag.values().length];
            f26190OooO00o = iArr;
            try {
                iArr[AbsListenerTag.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(p562o0oOo000.oo0o0Oo.activity_room_re_tag);
        if (getIntent() == null) {
            finish();
        } else {
            this.f26189OooOOoo = (RoomConfiguration) getIntent().getSerializableExtra("Module");
        }
        this.f22282OooOO0.setTitle(p562o0oOo000.o000000.createBar_txt_Category);
        this.f26187OooOOo = (ListView) findViewById(p562o0oOo000.o0OO00O.activity_room_re_tag_listview);
        p514o0o0O000.OooO0OO oooO0OO = new p514o0o0O000.OooO0OO(this);
        this.f26188OooOOo0 = oooO0OO;
        oooO0OO.f57682OooO0Oo = new o00O0O0(this);
        this.f26187OooOOo.setAdapter((ListAdapter) oooO0OO);
        this.f26188OooOOo0.OooO0o0(ApiTagUtils.f22249OooO0O0);
        ApiTagUtils.OooO0O0();
    }
}
