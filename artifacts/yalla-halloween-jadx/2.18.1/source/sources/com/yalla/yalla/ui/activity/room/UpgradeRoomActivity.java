package com.yalla.yalla.ui.activity.room;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import com.app.base.base.activity.BaseActivity;
import com.app.base.model.CreateBarModel;
import com.app.base.model.RoomIndexModel;
import com.umeng.analytics.MobclickAgent;
import com.weieyu.yalla.R;
import java.util.List;
import java.util.Map;
import p153o00Oo0oO.o0ooOOo;
import p160o00OoOO0.o00OO0O0;
import p168o00Ooo0.o0O0O00;
import p254o00ooO0O.o000O0O0;
import p418o0Oo0oo.oo000o;
import p530o0o0OOO.o00OO00O;
import p544o0o0OoOO.e7;
import p544o0o0OoOO.f7;

/* JADX INFO: loaded from: classes2.dex */
public class UpgradeRoomActivity extends BaseActivity {

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public RelativeLayout f23034OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public RelativeLayout f23035OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public RelativeLayout f23036OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public RelativeLayout f23037Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public RelativeLayout f23038Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public ImageView f23039OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public ImageView f23040OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public ImageView f23041OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public ImageView f23042Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public ImageView f23043Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public View f23044OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public LinearLayout f23045Ooooooo;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    public float f23047o000000;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    public List<CreateBarModel.CreatBarMemoy> f23048o000000O;

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    public CreateBarModel.CreatBarMemoy f23049o000000o;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public String f23051o000OOo;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public TextView f23052o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public TextView f23053o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public TextView f23054o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public TextView f23055o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public TextView f23056o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public TextView f23057o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public TextView f23058o00ooo;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public int f23059o0O0O00;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public LinearLayout f23060o0OO00O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public ImageView f23061o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public TextView f23062o0Oo0oo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public TextView f23063o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public TextView f23064o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public Button f23065o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public TextView f23066o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public TextView f23067oo000o;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public int f23068oo0o0Oo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public TextView f23069ooOO;

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    public int f23046o00000 = 1;

    /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
    public int f23050o00000O0 = 0;

    public class OooO00o implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ RelativeLayout f23070Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ RelativeLayout f23071Oooo0oO;

        public OooO00o(RelativeLayout relativeLayout, RelativeLayout relativeLayout2) {
            this.f23070Oooo0o = relativeLayout;
            this.f23071Oooo0oO = relativeLayout2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (UpgradeRoomActivity.this.f23068oo0o0Oo / ((Float) valueAnimator.getAnimatedValue()).floatValue());
            ViewGroup.LayoutParams layoutParams = this.f23070Oooo0o.getLayoutParams();
            layoutParams.height = iFloatValue;
            layoutParams.width = iFloatValue;
            int iFloatValue2 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * UpgradeRoomActivity.this.f23059o0O0O00);
            ViewGroup.LayoutParams layoutParams2 = this.f23071Oooo0oO.getLayoutParams();
            layoutParams2.height = iFloatValue2;
            layoutParams2.width = iFloatValue2;
            this.f23071Oooo0oO.setLayoutParams(layoutParams2);
            this.f23070Oooo0o.setLayoutParams(layoutParams);
        }
    }

    public static void OooOoO(UpgradeRoomActivity upgradeRoomActivity, int i) {
        upgradeRoomActivity.f23050o00000O0 = i;
        if (i == 1) {
            upgradeRoomActivity.f23034OoooOo0.setBackgroundResource(R.drawable.bg_upgrage_room_bg_gone);
            upgradeRoomActivity.f23063o0OoOo0.setVisibility(0);
            upgradeRoomActivity.f23040OooooOO.setVisibility(0);
            return;
        }
        if (i == 2) {
            upgradeRoomActivity.f23034OoooOo0.setBackgroundResource(R.drawable.bg_upgrage_room_bg_gone);
            upgradeRoomActivity.f23035OoooOoO.setBackgroundResource(R.drawable.bg_upgrage_room_bg_gone);
            upgradeRoomActivity.f23063o0OoOo0.setVisibility(8);
            upgradeRoomActivity.f23069ooOO.setVisibility(0);
            upgradeRoomActivity.f23041OooooOo.setVisibility(0);
            return;
        }
        if (i == 3) {
            upgradeRoomActivity.f23034OoooOo0.setBackgroundResource(R.drawable.bg_upgrage_room_bg_gone);
            upgradeRoomActivity.f23035OoooOoO.setBackgroundResource(R.drawable.bg_upgrage_room_bg_gone);
            upgradeRoomActivity.f23036OoooOoo.setBackgroundResource(R.drawable.bg_upgrage_room_bg_gone);
            upgradeRoomActivity.f23063o0OoOo0.setVisibility(8);
            upgradeRoomActivity.f23069ooOO.setVisibility(8);
            upgradeRoomActivity.f23052o00O0O.setVisibility(0);
            upgradeRoomActivity.f23043Oooooo0.setVisibility(0);
            return;
        }
        if (i == 4) {
            upgradeRoomActivity.f23034OoooOo0.setBackgroundResource(R.drawable.bg_upgrage_room_bg_gone);
            upgradeRoomActivity.f23035OoooOoO.setBackgroundResource(R.drawable.bg_upgrage_room_bg_gone);
            upgradeRoomActivity.f23036OoooOoo.setBackgroundResource(R.drawable.bg_upgrage_room_bg_gone);
            upgradeRoomActivity.f23037Ooooo00.setBackgroundResource(R.drawable.bg_upgrage_room_bg_gone);
            upgradeRoomActivity.f23063o0OoOo0.setVisibility(8);
            upgradeRoomActivity.f23069ooOO.setVisibility(8);
            upgradeRoomActivity.f23052o00O0O.setVisibility(8);
            upgradeRoomActivity.f23053o00Oo0.setVisibility(0);
            upgradeRoomActivity.f23042Oooooo.setVisibility(0);
            return;
        }
        if (i != 5) {
            return;
        }
        upgradeRoomActivity.f23034OoooOo0.setBackgroundResource(R.drawable.bg_upgrage_room_bg_gone);
        upgradeRoomActivity.f23035OoooOoO.setBackgroundResource(R.drawable.bg_upgrage_room_bg_gone);
        upgradeRoomActivity.f23036OoooOoo.setBackgroundResource(R.drawable.bg_upgrage_room_bg_gone);
        upgradeRoomActivity.f23037Ooooo00.setBackgroundResource(R.drawable.bg_upgrage_room_bg_gone);
        upgradeRoomActivity.f23038Ooooo0o.setBackgroundResource(R.drawable.bg_upgrage_room_bg_gone);
        upgradeRoomActivity.f23063o0OoOo0.setVisibility(8);
        upgradeRoomActivity.f23069ooOO.setVisibility(8);
        upgradeRoomActivity.f23052o00O0O.setVisibility(8);
        upgradeRoomActivity.f23053o00Oo0.setVisibility(8);
        upgradeRoomActivity.f23054o00Ooo.setVisibility(0);
        upgradeRoomActivity.f23042Oooooo.setVisibility(0);
    }

    public static void OooOoOO(Activity activity) {
        o00OO00O.OooO00o oooO00o = o00OO00O.f43313OooooOo;
        String string = oooO00o.OooO00o().f43319OooO0Oo.getValue() != null ? oooO00o.OooO00o().f43319OooO0Oo.getValue().toString() : "";
        if (TextUtils.isEmpty(string)) {
            p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
            MutableLiveData<RoomIndexModel> mutableLiveData = p498o0o00Oo0.OooOOO.f41251Oooo0OO;
            if (mutableLiveData != null && mutableLiveData.getValue() != null && !p498o0o00Oo0.OooOOO.f41251Oooo0OO.getValue().barid.isEmpty()) {
                string = p498o0o00Oo0.OooOOO.f41251Oooo0OO.getValue().barid;
            }
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) UpgradeRoomActivity.class);
        intent.putExtra("UPGRADEROOM_ROOMID", string);
        activity.startActivity(intent);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity
    public final void OooOOoo() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(com.yalla.support.common.util.OooO0OO.OooO00o(this.f23051o000OOo) ? "Create" : "Upgrade");
        MobclickAgent.onPageEnd(sb.toString());
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity
    public final void OooOo00() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(com.yalla.support.common.util.OooO0OO.OooO00o(this.f23051o000OOo) ? "Create" : "Upgrade");
        MobclickAgent.onPageStart(sb.toString());
    }

    public final void OooOoo0(int i, boolean z) {
        RelativeLayout relativeLayout;
        RelativeLayout relativeLayout2;
        RelativeLayout relativeLayout3;
        if ((this.f23046o00000 != i || z) && !com.yalla.support.common.util.OooO0OO.OooO00o(this.f23048o000000O)) {
            int i2 = this.f23046o00000;
            if (i2 == 1) {
                this.f23039OooooO0.setVisibility(8);
                relativeLayout = this.f23034OoooOo0;
            } else if (i2 == 2) {
                this.f23040OooooOO.setVisibility(8);
                relativeLayout = this.f23035OoooOoO;
            } else if (i2 == 3) {
                this.f23041OooooOo.setVisibility(8);
                relativeLayout = this.f23036OoooOoo;
            } else if (i2 == 4) {
                this.f23043Oooooo0.setVisibility(8);
                relativeLayout = this.f23037Ooooo00;
            } else if (i2 != 5) {
                relativeLayout = null;
            } else {
                this.f23042Oooooo.setVisibility(8);
                relativeLayout = this.f23038Ooooo0o;
            }
            List<CreateBarModel.CreatBarMemoy> list = this.f23048o000000O;
            int i3 = i - 1;
            this.f23049o000000o = list.get(i3 >= list.size() ? this.f23048o000000O.size() - 1 : i3);
            if (this.f23050o00000O0 != 0) {
                this.f23056o00oO0O.setText((Integer.parseInt(this.f23049o000000o.maxnum) - Integer.parseInt(this.f23048o000000O.get(this.f23050o00000O0 - 1).maxnum)) + ",000");
            } else {
                this.f23056o00oO0O.setText(Integer.parseInt(this.f23049o000000o.maxnum) + ",000");
            }
            if (this.f23051o000OOo != null && i <= this.f23050o00000O0) {
                this.f23065o0ooOOo.setEnabled(false);
            } else {
                this.f23065o0ooOOo.setEnabled(true);
            }
            if (i <= this.f23050o00000O0) {
                this.f23064o0ooOO0.setVisibility(0);
                this.f23060o0OO00O.setVisibility(4);
                int i4 = this.f23050o00000O0;
                if (i4 == 1) {
                    this.f23064o0ooOO0.setText(com.yalla.support.common.util.OooOo.OooO00o(getResources().getString(R.string.user_room_type), getResources().getString(R.string.money_bar_title_1)));
                } else if (i4 == 2) {
                    this.f23064o0ooOO0.setText(com.yalla.support.common.util.OooOo.OooO00o(getResources().getString(R.string.user_room_type), getResources().getString(R.string.money_bar_title_2)));
                } else if (i4 != 3) {
                    if (i4 == 4) {
                        this.f23064o0ooOO0.setText(com.yalla.support.common.util.OooOo.OooO00o(getResources().getString(R.string.user_room_type), getResources().getString(R.string.money_bar_title_4)));
                    } else if (i4 == 5) {
                    }
                    this.f23064o0ooOO0.setText(com.yalla.support.common.util.OooOo.OooO00o(getResources().getString(R.string.user_room_type), getResources().getString(R.string.money_bar_title_5)));
                } else {
                    this.f23064o0ooOO0.setText(com.yalla.support.common.util.OooOo.OooO00o(getResources().getString(R.string.user_room_type), getResources().getString(R.string.money_bar_title_3)));
                }
            } else {
                this.f23064o0ooOO0.setVisibility(4);
                this.f23060o0OO00O.setVisibility(0);
            }
            this.f23055o00o0O.setText(com.yalla.support.common.util.OooOo.OooO00o(getResources().getString(R.string.room_online_num_des), o0O0O00.OooO0Oo(this.f23048o000000O.get(i3).maxline)));
            if (i == 1) {
                this.f23039OooooO0.setVisibility(0);
                relativeLayout2 = this.f23034OoooOo0;
                this.f23066o0ooOoO.setText(R.string.money_bar_title_1);
                this.f23056o00oO0O.setText(R.string.money_Free);
                this.f23067oo000o.setText(com.yalla.support.common.util.OooOo.OooO00o(getResources().getString(R.string.room_info_rank), "1.0"));
                this.f23057o00oO0o.setText(com.yalla.support.common.util.OooOo.OooO00o(getResources().getString(R.string.MAX_XXX_members_in_the_room), "1000"));
                this.f23061o0OOO0o.setVisibility(8);
                this.f23058o00ooo.setText(com.yalla.support.common.util.OooOo.OooO00o(getResources().getString(R.string.room_info_administor), "7"));
            } else {
                if (i != 2) {
                    if (i == 3) {
                        this.f23041OooooOo.setVisibility(0);
                        relativeLayout2 = this.f23036OoooOoo;
                        this.f23066o0ooOoO.setText(R.string.money_bar_title_3);
                        this.f23067oo000o.setText(com.yalla.support.common.util.OooOo.OooO00o(getResources().getString(R.string.room_info_rank), "1.3"));
                        this.f23057o00oO0o.setText(com.yalla.support.common.util.OooOo.OooO00o(getResources().getString(R.string.MAX_XXX_members_in_the_room), "3000"));
                        this.f23061o0OOO0o.setVisibility(0);
                        this.f23058o00ooo.setText(com.yalla.support.common.util.OooOo.OooO00o(getResources().getString(R.string.room_info_administor), "7"));
                    } else if (i == 4) {
                        this.f23043Oooooo0.setVisibility(0);
                        relativeLayout3 = this.f23037Ooooo00;
                        this.f23066o0ooOoO.setText(R.string.money_bar_title_4);
                        this.f23067oo000o.setText(com.yalla.support.common.util.OooOo.OooO00o(getResources().getString(R.string.room_info_rank), "1.5"));
                        this.f23057o00oO0o.setText(com.yalla.support.common.util.OooOo.OooO00o(getResources().getString(R.string.MAX_XXX_members_in_the_room), "40000"));
                        this.f23061o0OOO0o.setVisibility(0);
                        this.f23058o00ooo.setText(com.yalla.support.common.util.OooOo.OooO00o(getResources().getString(R.string.room_info_administor), "13"));
                    } else if (i != 5) {
                        relativeLayout3 = null;
                    } else {
                        this.f23042Oooooo.setVisibility(0);
                        relativeLayout3 = this.f23038Ooooo0o;
                        this.f23066o0ooOoO.setText(R.string.money_bar_title_5);
                        this.f23067oo000o.setText(com.yalla.support.common.util.OooOo.OooO00o(getResources().getString(R.string.room_info_rank), "1.8"));
                        this.f23057o00oO0o.setText(com.yalla.support.common.util.OooOo.OooO00o(getResources().getString(R.string.MAX_XXX_members_in_the_room), "50000"));
                        this.f23061o0OOO0o.setVisibility(0);
                        this.f23058o00ooo.setText(com.yalla.support.common.util.OooOo.OooO00o(getResources().getString(R.string.room_info_administor), "20"));
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, this.f23047o000000);
                    valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                    valueAnimatorOfFloat.addUpdateListener(new OooO00o(relativeLayout, relativeLayout3));
                    valueAnimatorOfFloat.setDuration(300L).start();
                    this.f23046o00000 = i;
                }
                this.f23040OooooOO.setVisibility(0);
                relativeLayout2 = this.f23035OoooOoO;
                this.f23066o0ooOoO.setText(R.string.money_bar_title_2);
                this.f23067oo000o.setText(com.yalla.support.common.util.OooOo.OooO00o(getResources().getString(R.string.room_info_rank), "1.2"));
                this.f23057o00oO0o.setText(com.yalla.support.common.util.OooOo.OooO00o(getResources().getString(R.string.MAX_XXX_members_in_the_room), "2000"));
                this.f23061o0OOO0o.setVisibility(0);
                this.f23058o00ooo.setText(com.yalla.support.common.util.OooOo.OooO00o(getResources().getString(R.string.room_info_administor), "7"));
            }
            relativeLayout3 = relativeLayout2;
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, this.f23047o000000);
            valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat2.addUpdateListener(new OooO00o(relativeLayout, relativeLayout3));
            valueAnimatorOfFloat2.setDuration(300L).start();
            this.f23046o00000 = i;
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.rl_bg_1) {
            OooOoo0(1, false);
            return;
        }
        if (id == R.id.rl_bg_2) {
            OooOoo0(2, false);
            return;
        }
        if (id == R.id.rl_bg_3) {
            OooOoo0(3, false);
            return;
        }
        if (id == R.id.rl_bg_4) {
            OooOoo0(4, false);
            return;
        }
        if (id == R.id.rl_bg_5) {
            OooOoo0(5, false);
            return;
        }
        if (id == R.id.bt_commit) {
            String str = this.f23051o000OOo;
            String strValueOf = String.valueOf(this.f23046o00000);
            f7 f7Var = new f7(this, this);
            Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
            mapOooO0O0.put("barid", str);
            mapOooO0O0.put("type", strValueOf);
            f7Var.setHaveBeforeAfter(true);
            f7Var.setTitle(o000O0O0.OooO0OO(R.string.loading));
            o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
            o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32259OoooO, mapOooO0O0, f7Var);
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_upgraderoom);
        this.f23034OoooOo0 = (RelativeLayout) findViewById(R.id.rl_bg_1);
        this.f23035OoooOoO = (RelativeLayout) findViewById(R.id.rl_bg_2);
        this.f23036OoooOoo = (RelativeLayout) findViewById(R.id.rl_bg_3);
        this.f23037Ooooo00 = (RelativeLayout) findViewById(R.id.rl_bg_4);
        this.f23038Ooooo0o = (RelativeLayout) findViewById(R.id.rl_bg_5);
        this.f23039OooooO0 = (ImageView) findViewById(R.id.iv_selected_tag1);
        this.f23040OooooOO = (ImageView) findViewById(R.id.iv_selected_tag2);
        this.f23041OooooOo = (ImageView) findViewById(R.id.iv_selected_tag3);
        this.f23043Oooooo0 = (ImageView) findViewById(R.id.iv_selected_tag4);
        this.f23042Oooooo = (ImageView) findViewById(R.id.iv_selected_tag5);
        this.f23044OoooooO = findViewById(R.id.v);
        this.f23045Ooooooo = (LinearLayout) findViewById(R.id.ll_room);
        this.f23063o0OoOo0 = (TextView) findViewById(R.id.bt_my_tag1);
        this.f23069ooOO = (TextView) findViewById(R.id.bt_my_tag2);
        this.f23052o00O0O = (TextView) findViewById(R.id.bt_my_tag3);
        this.f23053o00Oo0 = (TextView) findViewById(R.id.bt_my_tag4);
        this.f23054o00Ooo = (TextView) findViewById(R.id.bt_my_tag5);
        this.f23055o00o0O = (TextView) findViewById(R.id.tv_tips1_des);
        this.f23058o00ooo = (TextView) findViewById(R.id.tv_tips2_des);
        this.f23067oo000o = (TextView) findViewById(R.id.tv_tips3_des);
        this.f23057o00oO0o = (TextView) findViewById(R.id.activity_upgraderoom_tv_memberNum_des);
        this.f23056o00oO0O = (TextView) findViewById(R.id.tv_price);
        this.f23064o0ooOO0 = (TextView) findViewById(R.id.tv_tips_coin);
        this.f23065o0ooOOo = (Button) findViewById(R.id.bt_commit);
        this.f23066o0ooOoO = (TextView) findViewById(R.id.tv_room_type_name);
        this.f23061o0OOO0o = (ImageView) findViewById(R.id.iv_coin);
        this.f23062o0Oo0oo = (TextView) findViewById(R.id.tv_creat_tips);
        this.f23060o0OO00O = (LinearLayout) findViewById(R.id.ll_room_parice);
        int width = (getWindowManager().getDefaultDisplay().getWidth() - oo000o.OooO00o(this, 67.0d)) / 5;
        this.f23059o0O0O00 = width;
        int iOooO00o = oo000o.OooO00o(this, 11.0d) + width;
        this.f23068oo0o0Oo = iOooO00o;
        this.f23047o000000 = iOooO00o / this.f23059o0O0O00;
        ViewGroup.LayoutParams layoutParams = this.f23034OoooOo0.getLayoutParams();
        int i = this.f23068oo0o0Oo;
        layoutParams.width = i;
        layoutParams.height = i;
        ViewGroup.LayoutParams layoutParams2 = this.f23035OoooOoO.getLayoutParams();
        int i2 = this.f23059o0O0O00;
        layoutParams2.width = i2;
        layoutParams2.height = i2;
        ViewGroup.LayoutParams layoutParams3 = this.f23036OoooOoo.getLayoutParams();
        int i3 = this.f23059o0O0O00;
        layoutParams3.width = i3;
        layoutParams3.height = i3;
        ViewGroup.LayoutParams layoutParams4 = this.f23037Ooooo00.getLayoutParams();
        int i4 = this.f23059o0O0O00;
        layoutParams4.width = i4;
        layoutParams4.height = i4;
        ViewGroup.LayoutParams layoutParams5 = this.f23038Ooooo0o.getLayoutParams();
        int i5 = this.f23059o0O0O00;
        layoutParams5.width = i5;
        layoutParams5.height = i5;
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, this.f23068oo0o0Oo);
        layoutParams6.gravity = 17;
        this.f23045Ooooooo.setLayoutParams(layoutParams6);
        this.f23034OoooOo0.setOnClickListener(this);
        this.f23035OoooOoO.setOnClickListener(this);
        this.f23036OoooOoo.setOnClickListener(this);
        this.f23037Ooooo00.setOnClickListener(this);
        this.f23038Ooooo0o.setOnClickListener(this);
        this.f23065o0ooOOo.setOnClickListener(this);
        String stringExtra = getIntent().getStringExtra("UPGRADEROOM_ROOMID");
        this.f23051o000OOo = stringExtra;
        if (com.yalla.support.common.util.OooO0OO.OooO0O0(stringExtra)) {
            String str = this.f23051o000OOo;
            e7 e7Var = new e7(this, this);
            Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
            mapOooO0O0.put("barid", str);
            e7Var.setHaveBeforeAfter(true);
            e7Var.setTitle(o000O0O0.OooO0OO(R.string.loading));
            o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
            o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32262OoooO0O, mapOooO0O0, e7Var);
            this.f23065o0ooOOo.setText(R.string.Upgrade);
            OooOo(R.string.title_activity_upbar);
            this.f23062o0Oo0oo.setVisibility(8);
        }
    }
}
