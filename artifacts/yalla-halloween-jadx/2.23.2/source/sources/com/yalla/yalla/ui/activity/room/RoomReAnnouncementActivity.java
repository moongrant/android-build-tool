package com.yalla.yalla.ui.activity.room;

import android.os.Bundle;
import android.os.Looper;
import android.text.InputFilter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.mixedroom.model.RoomConfiguration;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public class RoomReAnnouncementActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final /* synthetic */ int f26174OooOo0O = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public TextView f26175OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public EditText f26176OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public ImageView f26177OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public String f26178OooOo0 = "";

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public TextView f26179OooOo00;

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(p562o0oOo000.oo0o0Oo.activity_room_re_announcement);
        if (getIntent() == null || ((RoomConfiguration) getIntent().getSerializableExtra("Module")) == null) {
            finish();
        }
        this.f22282OooOO0.setTitle(p562o0oOo000.o000000.Announcement);
        OooOOo0(0);
        this.f26176OooOOo0 = (EditText) findViewById(p562o0oOo000.o0OO00O.activity_room_re_announcement_edit);
        this.f26177OooOOoo = (ImageView) findViewById(p562o0oOo000.o0OO00O.activity_room_re_announcement_clean);
        this.f26175OooOOo = (TextView) findViewById(p562o0oOo000.o0OO00O.activity_room_re_announcement_count);
        this.f26177OooOOoo.setVisibility(8);
        this.f26177OooOOoo.setOnClickListener(new o00O000o(this));
        this.f26176OooOOo0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
        this.f26176OooOOo0.setOnEditorActionListener(new o00O00());
        this.f26176OooOOo0.addTextChangedListener(new o00O00O(this));
        this.f22282OooOO0.OooOo00(new Function0() { // from class: com.yalla.yalla.ui.activity.room.o00O000
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = RoomReAnnouncementActivity.f26174OooOo0O;
                this.f26404OooO0Oo.finish();
                return null;
            }
        });
        this.f26179OooOo00 = this.f22282OooOO0.OooOoO(getString(p562o0oOo000.o000000.Save), new oOO00O(this));
        this.f26176OooOOo0.setText(com.yalla.yalla.service.room.OooO00o.f24516OooO0o0.f48463OooO0o.getValue());
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p545o0oO0O00.OooOOOO
    public final void onEventMainThread(p545o0oO0O00.OooOOO oooOOO) {
        super.onEventMainThread(oooOOO);
        if (oooOOO.f55758OooO00o == 33) {
            LiveEventBus.get("RoomAnnouncement").post(this.f26178OooOo0);
            String string = getResources().getString(p562o0oOo000.o000000.OK);
            if (!(string == null || StringsKt.isBlank(string))) {
                com.code.android.util.o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(string, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    com.code.android.util.o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
            finish();
        }
    }
}
