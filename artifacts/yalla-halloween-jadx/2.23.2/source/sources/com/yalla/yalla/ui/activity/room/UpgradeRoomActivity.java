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
import com.google.gson.reflect.TypeToken;
import com.jeremyliao.liveeventbus.BuildConfig;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.model.CommonListResult;
import com.yalla.yalla.model.CreateBarModel;
import java.util.LinkedHashMap;
import java.util.List;
import p590o0oOooo0.oOOO00;

/* JADX INFO: loaded from: classes4.dex */
public class UpgradeRoomActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public RelativeLayout f26261OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public RelativeLayout f26262OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public RelativeLayout f26263OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public ImageView f26264OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public RelativeLayout f26265OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public RelativeLayout f26266OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public ImageView f26267OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ImageView f26268OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public ImageView f26269OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public ImageView f26270OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public View f26271OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public TextView f26272OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public LinearLayout f26273OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public TextView f26274OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public TextView f26275OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public ImageView f26276Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public TextView f26277Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public TextView f26278Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public TextView f26279Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public TextView f26280Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public TextView f26281Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public TextView f26282Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public TextView f26283Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public TextView f26284Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Button f26285Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public TextView f26286Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f26287OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public LinearLayout f26288OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public TextView f26289OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f26290OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public String f26291OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public List<CreateBarModel.CreatBarMemoy> f26292OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public CreateBarModel.CreatBarMemoy f26293OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int f26294OoooOo0 = 1;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public int f26295OoooOoO = 0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public float f26296o000oOoO;

    public class OooO00o implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RelativeLayout f26298OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RelativeLayout f26300OooO0o0;

        public OooO00o(RelativeLayout relativeLayout, RelativeLayout relativeLayout2) {
            this.f26298OooO0Oo = relativeLayout;
            this.f26300OooO0o0 = relativeLayout2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            UpgradeRoomActivity upgradeRoomActivity = UpgradeRoomActivity.this;
            int iFloatValue = (int) (upgradeRoomActivity.f26290OoooO0O / ((Float) valueAnimator.getAnimatedValue()).floatValue());
            RelativeLayout relativeLayout = this.f26298OooO0Oo;
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            layoutParams.height = iFloatValue;
            layoutParams.width = iFloatValue;
            int iFloatValue2 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * upgradeRoomActivity.f26287OoooO);
            RelativeLayout relativeLayout2 = this.f26300OooO0o0;
            ViewGroup.LayoutParams layoutParams2 = relativeLayout2.getLayoutParams();
            layoutParams2.height = iFloatValue2;
            layoutParams2.width = iFloatValue2;
            relativeLayout2.setLayoutParams(layoutParams2);
            relativeLayout.setLayoutParams(layoutParams);
        }
    }

    public static void OooOo0(UpgradeRoomActivity upgradeRoomActivity, int i) {
        upgradeRoomActivity.f26295OoooOoO = i;
        if (i == 1) {
            upgradeRoomActivity.f26262OooOOo0.setBackgroundResource(p562o0oOo000.o0Oo0oo.bg_upgrage_room_bg_gone);
            upgradeRoomActivity.f26272OooOoo.setVisibility(0);
            upgradeRoomActivity.f26268OooOo0o.setVisibility(0);
            return;
        }
        if (i == 2) {
            RelativeLayout relativeLayout = upgradeRoomActivity.f26262OooOOo0;
            int i2 = p562o0oOo000.o0Oo0oo.bg_upgrage_room_bg_gone;
            relativeLayout.setBackgroundResource(i2);
            upgradeRoomActivity.f26261OooOOo.setBackgroundResource(i2);
            upgradeRoomActivity.f26272OooOoo.setVisibility(8);
            upgradeRoomActivity.f26274OooOooO.setVisibility(0);
            upgradeRoomActivity.f26264OooOo.setVisibility(0);
            return;
        }
        if (i == 3) {
            RelativeLayout relativeLayout2 = upgradeRoomActivity.f26262OooOOo0;
            int i3 = p562o0oOo000.o0Oo0oo.bg_upgrage_room_bg_gone;
            relativeLayout2.setBackgroundResource(i3);
            upgradeRoomActivity.f26261OooOOo.setBackgroundResource(i3);
            upgradeRoomActivity.f26263OooOOoo.setBackgroundResource(i3);
            upgradeRoomActivity.f26272OooOoo.setVisibility(8);
            upgradeRoomActivity.f26274OooOooO.setVisibility(8);
            upgradeRoomActivity.f26275OooOooo.setVisibility(0);
            upgradeRoomActivity.f26270OooOoO0.setVisibility(0);
            return;
        }
        if (i == 4) {
            RelativeLayout relativeLayout3 = upgradeRoomActivity.f26262OooOOo0;
            int i4 = p562o0oOo000.o0Oo0oo.bg_upgrage_room_bg_gone;
            relativeLayout3.setBackgroundResource(i4);
            upgradeRoomActivity.f26261OooOOo.setBackgroundResource(i4);
            upgradeRoomActivity.f26263OooOOoo.setBackgroundResource(i4);
            upgradeRoomActivity.f26266OooOo00.setBackgroundResource(i4);
            upgradeRoomActivity.f26272OooOoo.setVisibility(8);
            upgradeRoomActivity.f26274OooOooO.setVisibility(8);
            upgradeRoomActivity.f26275OooOooo.setVisibility(8);
            upgradeRoomActivity.f26278Oooo000.setVisibility(0);
            upgradeRoomActivity.f26269OooOoO.setVisibility(0);
            return;
        }
        if (i != 5) {
            return;
        }
        RelativeLayout relativeLayout4 = upgradeRoomActivity.f26262OooOOo0;
        int i5 = p562o0oOo000.o0Oo0oo.bg_upgrage_room_bg_gone;
        relativeLayout4.setBackgroundResource(i5);
        upgradeRoomActivity.f26261OooOOo.setBackgroundResource(i5);
        upgradeRoomActivity.f26263OooOOoo.setBackgroundResource(i5);
        upgradeRoomActivity.f26266OooOo00.setBackgroundResource(i5);
        upgradeRoomActivity.f26265OooOo0.setBackgroundResource(i5);
        upgradeRoomActivity.f26272OooOoo.setVisibility(8);
        upgradeRoomActivity.f26274OooOooO.setVisibility(8);
        upgradeRoomActivity.f26275OooOooo.setVisibility(8);
        upgradeRoomActivity.f26278Oooo000.setVisibility(8);
        upgradeRoomActivity.f26279Oooo00O.setVisibility(0);
        upgradeRoomActivity.f26269OooOoO.setVisibility(0);
    }

    public static void OooOo0O(Activity activity) {
        o0Ooooo0.o0O00oO0.o0000 o0000Var;
        com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO;
        String string = oooO00o.OooO00o().f24539OooO0Oo.getValue() != null ? oooO00o.OooO00o().f24539OooO0Oo.getValue().toString() : "";
        if (TextUtils.isEmpty(string) && (o0000Var = p475o0Ooooo0.o0O00oO0.f47987Ooooo00) != null && o0000Var.getValue() != null && !o0000Var.getValue().barid.isEmpty()) {
            string = o0000Var.getValue().barid;
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) UpgradeRoomActivity.class);
        intent.putExtra("UPGRADEROOM_ROOMID", string);
        activity.startActivity(intent);
    }

    public final void OooOo0o(int i, boolean z) {
        RelativeLayout relativeLayout;
        RelativeLayout relativeLayout2;
        RelativeLayout relativeLayout3;
        if ((this.f26294OoooOo0 != i || z) && !com.code.android.util.OooOo00.OooO00o(this.f26292OoooOOO)) {
            int i2 = this.f26294OoooOo0;
            if (i2 == 1) {
                this.f26267OooOo0O.setVisibility(8);
                relativeLayout = this.f26262OooOOo0;
            } else if (i2 == 2) {
                this.f26268OooOo0o.setVisibility(8);
                relativeLayout = this.f26261OooOOo;
            } else if (i2 == 3) {
                this.f26264OooOo.setVisibility(8);
                relativeLayout = this.f26263OooOOoo;
            } else if (i2 == 4) {
                this.f26270OooOoO0.setVisibility(8);
                relativeLayout = this.f26266OooOo00;
            } else if (i2 != 5) {
                relativeLayout = null;
            } else {
                this.f26269OooOoO.setVisibility(8);
                relativeLayout = this.f26265OooOo0;
            }
            List<CreateBarModel.CreatBarMemoy> list = this.f26292OoooOOO;
            int i3 = i - 1;
            this.f26293OoooOOo = list.get(i3 >= list.size() ? this.f26292OoooOOO.size() - 1 : i3);
            if (this.f26295OoooOoO != 0) {
                this.f26284Oooo0o0.setText((Integer.parseInt(this.f26293OoooOOo.maxnum) - Integer.parseInt(this.f26292OoooOOO.get(this.f26295OoooOoO - 1).maxnum)) + ",000");
            } else {
                this.f26284Oooo0o0.setText(Integer.parseInt(this.f26293OoooOOo.maxnum) + ",000");
            }
            if (this.f26291OoooOO0 != null && i <= this.f26295OoooOoO) {
                this.f26285Oooo0oO.setEnabled(false);
            } else {
                this.f26285Oooo0oO.setEnabled(true);
            }
            if (i <= this.f26295OoooOoO) {
                this.f26283Oooo0o.setVisibility(0);
                this.f26288OoooO0.setVisibility(4);
                int i4 = this.f26295OoooOoO;
                if (i4 == 1) {
                    this.f26283Oooo0o.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(p562o0oOo000.o000000.user_room_type), getResources().getString(p562o0oOo000.o000000.money_bar_title_1)));
                } else if (i4 == 2) {
                    this.f26283Oooo0o.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(p562o0oOo000.o000000.user_room_type), getResources().getString(p562o0oOo000.o000000.money_bar_title_2)));
                } else if (i4 != 3) {
                    if (i4 == 4) {
                        this.f26283Oooo0o.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(p562o0oOo000.o000000.user_room_type), getResources().getString(p562o0oOo000.o000000.money_bar_title_4)));
                    } else if (i4 == 5) {
                    }
                    this.f26283Oooo0o.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(p562o0oOo000.o000000.user_room_type), getResources().getString(p562o0oOo000.o000000.money_bar_title_5)));
                } else {
                    this.f26283Oooo0o.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(p562o0oOo000.o000000.user_room_type), getResources().getString(p562o0oOo000.o000000.money_bar_title_3)));
                }
            } else {
                this.f26283Oooo0o.setVisibility(4);
                this.f26288OoooO0.setVisibility(0);
            }
            this.f26280Oooo00o.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(p562o0oOo000.o000000.room_online_num_des), p605o0oo0O0O.o0O0O0Oo.OooO0Oo(this.f26292OoooOOO.get(i3).maxline)));
            if (i == 1) {
                this.f26267OooOo0O.setVisibility(0);
                relativeLayout2 = this.f26262OooOOo0;
                this.f26286Oooo0oo.setText(p562o0oOo000.o000000.money_bar_title_1);
                this.f26284Oooo0o0.setText(p562o0oOo000.o000000.money_Free);
                this.f26281Oooo0O0.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(p562o0oOo000.o000000.room_info_rank), BuildConfig.VERSION_NAME));
                this.f26282Oooo0OO.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(p562o0oOo000.o000000.MAX_XXX_members_in_the_room), "1000"));
                this.f26276Oooo.setVisibility(8);
                this.f26277Oooo0.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(p562o0oOo000.o000000.room_info_administor), "7"));
            } else {
                if (i != 2) {
                    if (i == 3) {
                        this.f26264OooOo.setVisibility(0);
                        relativeLayout2 = this.f26263OooOOoo;
                        this.f26286Oooo0oo.setText(p562o0oOo000.o000000.money_bar_title_3);
                        this.f26281Oooo0O0.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(p562o0oOo000.o000000.room_info_rank), "1.3"));
                        this.f26282Oooo0OO.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(p562o0oOo000.o000000.MAX_XXX_members_in_the_room), "3000"));
                        this.f26276Oooo.setVisibility(0);
                        this.f26277Oooo0.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(p562o0oOo000.o000000.room_info_administor), "7"));
                    } else if (i == 4) {
                        this.f26270OooOoO0.setVisibility(0);
                        relativeLayout3 = this.f26266OooOo00;
                        this.f26286Oooo0oo.setText(p562o0oOo000.o000000.money_bar_title_4);
                        this.f26281Oooo0O0.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(p562o0oOo000.o000000.room_info_rank), "1.5"));
                        this.f26282Oooo0OO.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(p562o0oOo000.o000000.MAX_XXX_members_in_the_room), "40000"));
                        this.f26276Oooo.setVisibility(0);
                        this.f26277Oooo0.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(p562o0oOo000.o000000.room_info_administor), "13"));
                    } else if (i != 5) {
                        relativeLayout3 = null;
                    } else {
                        this.f26269OooOoO.setVisibility(0);
                        relativeLayout3 = this.f26265OooOo0;
                        this.f26286Oooo0oo.setText(p562o0oOo000.o000000.money_bar_title_5);
                        this.f26281Oooo0O0.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(p562o0oOo000.o000000.room_info_rank), "1.8"));
                        this.f26282Oooo0OO.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(p562o0oOo000.o000000.MAX_XXX_members_in_the_room), "50000"));
                        this.f26276Oooo.setVisibility(0);
                        this.f26277Oooo0.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(p562o0oOo000.o000000.room_info_administor), "20"));
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, this.f26296o000oOoO);
                    valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                    valueAnimatorOfFloat.addUpdateListener(new OooO00o(relativeLayout, relativeLayout3));
                    valueAnimatorOfFloat.setDuration(300L).start();
                    this.f26294OoooOo0 = i;
                }
                this.f26268OooOo0o.setVisibility(0);
                relativeLayout2 = this.f26261OooOOo;
                this.f26286Oooo0oo.setText(p562o0oOo000.o000000.money_bar_title_2);
                this.f26281Oooo0O0.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(p562o0oOo000.o000000.room_info_rank), "1.2"));
                this.f26282Oooo0OO.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(p562o0oOo000.o000000.MAX_XXX_members_in_the_room), "2000"));
                this.f26276Oooo.setVisibility(0);
                this.f26277Oooo0.setText(com.code.android.util.o0000O.OooO00o(getResources().getString(p562o0oOo000.o000000.room_info_administor), "7"));
            }
            relativeLayout3 = relativeLayout2;
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, this.f26296o000oOoO);
            valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat2.addUpdateListener(new OooO00o(relativeLayout, relativeLayout3));
            valueAnimatorOfFloat2.setDuration(300L).start();
            this.f26294OoooOo0 = i;
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == p562o0oOo000.o0OO00O.rl_bg_1) {
            OooOo0o(1, false);
            return;
        }
        if (id == p562o0oOo000.o0OO00O.rl_bg_2) {
            OooOo0o(2, false);
            return;
        }
        if (id == p562o0oOo000.o0OO00O.rl_bg_3) {
            OooOo0o(3, false);
            return;
        }
        if (id == p562o0oOo000.o0OO00O.rl_bg_4) {
            OooOo0o(4, false);
            return;
        }
        if (id == p562o0oOo000.o0OO00O.rl_bg_5) {
            OooOo0o(5, false);
            return;
        }
        if (id == p562o0oOo000.o0OO00O.bt_commit) {
            String str = this.f26291OoooOO0;
            String strValueOf = String.valueOf(this.f26294OoooOo0);
            o0oO0O0o o0oo0o0o2 = new o0oO0O0o(this, this);
            LinkedHashMap linkedHashMapOooO00o = p426o0OoO0o0.OooOOOO.OooO00o();
            linkedHashMapOooO00o.put("barid", str);
            linkedHashMapOooO00o.put("type", strValueOf);
            o0oo0o0o2.f22926OooO0O0 = true;
            o0oo0o0o2.f22927OooO0OO = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.loading);
            com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p384o0OOoo0O.Oooo0.f43359OooOoo, p384o0OOoo0O.Oooo0.f43374OoooO, linkedHashMapOooO00o, o0oo0o0o2);
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(p562o0oOo000.oo0o0Oo.activity_upgraderoom);
        this.f26262OooOOo0 = (RelativeLayout) findViewById(p562o0oOo000.o0OO00O.rl_bg_1);
        this.f26261OooOOo = (RelativeLayout) findViewById(p562o0oOo000.o0OO00O.rl_bg_2);
        this.f26263OooOOoo = (RelativeLayout) findViewById(p562o0oOo000.o0OO00O.rl_bg_3);
        this.f26266OooOo00 = (RelativeLayout) findViewById(p562o0oOo000.o0OO00O.rl_bg_4);
        this.f26265OooOo0 = (RelativeLayout) findViewById(p562o0oOo000.o0OO00O.rl_bg_5);
        this.f26267OooOo0O = (ImageView) findViewById(p562o0oOo000.o0OO00O.iv_selected_tag1);
        this.f26268OooOo0o = (ImageView) findViewById(p562o0oOo000.o0OO00O.iv_selected_tag2);
        this.f26264OooOo = (ImageView) findViewById(p562o0oOo000.o0OO00O.iv_selected_tag3);
        this.f26270OooOoO0 = (ImageView) findViewById(p562o0oOo000.o0OO00O.iv_selected_tag4);
        this.f26269OooOoO = (ImageView) findViewById(p562o0oOo000.o0OO00O.iv_selected_tag5);
        this.f26271OooOoOO = findViewById(p562o0oOo000.o0OO00O.v);
        this.f26273OooOoo0 = (LinearLayout) findViewById(p562o0oOo000.o0OO00O.ll_room);
        this.f26272OooOoo = (TextView) findViewById(p562o0oOo000.o0OO00O.bt_my_tag1);
        this.f26274OooOooO = (TextView) findViewById(p562o0oOo000.o0OO00O.bt_my_tag2);
        this.f26275OooOooo = (TextView) findViewById(p562o0oOo000.o0OO00O.bt_my_tag3);
        this.f26278Oooo000 = (TextView) findViewById(p562o0oOo000.o0OO00O.bt_my_tag4);
        this.f26279Oooo00O = (TextView) findViewById(p562o0oOo000.o0OO00O.bt_my_tag5);
        this.f26280Oooo00o = (TextView) findViewById(p562o0oOo000.o0OO00O.tv_tips1_des);
        this.f26277Oooo0 = (TextView) findViewById(p562o0oOo000.o0OO00O.tv_tips2_des);
        this.f26281Oooo0O0 = (TextView) findViewById(p562o0oOo000.o0OO00O.tv_tips3_des);
        this.f26282Oooo0OO = (TextView) findViewById(p562o0oOo000.o0OO00O.activity_upgraderoom_tv_memberNum_des);
        this.f26284Oooo0o0 = (TextView) findViewById(p562o0oOo000.o0OO00O.tv_price);
        this.f26283Oooo0o = (TextView) findViewById(p562o0oOo000.o0OO00O.tv_tips_coin);
        this.f26285Oooo0oO = (Button) findViewById(p562o0oOo000.o0OO00O.bt_commit);
        this.f26286Oooo0oo = (TextView) findViewById(p562o0oOo000.o0OO00O.tv_room_type_name);
        this.f26276Oooo = (ImageView) findViewById(p562o0oOo000.o0OO00O.iv_coin);
        this.f26289OoooO00 = (TextView) findViewById(p562o0oOo000.o0OO00O.tv_creat_tips);
        this.f26288OoooO0 = (LinearLayout) findViewById(p562o0oOo000.o0OO00O.ll_room_parice);
        int width = (getWindowManager().getDefaultDisplay().getWidth() - o0OO0.OooO0o.OooO0O0(this, 67.0d)) / 5;
        this.f26287OoooO = width;
        int iOooO0O0 = o0OO0.OooO0o.OooO0O0(this, 11.0d) + width;
        this.f26290OoooO0O = iOooO0O0;
        this.f26296o000oOoO = iOooO0O0 / this.f26287OoooO;
        ViewGroup.LayoutParams layoutParams = this.f26262OooOOo0.getLayoutParams();
        int i = this.f26290OoooO0O;
        layoutParams.width = i;
        layoutParams.height = i;
        ViewGroup.LayoutParams layoutParams2 = this.f26261OooOOo.getLayoutParams();
        int i2 = this.f26287OoooO;
        layoutParams2.width = i2;
        layoutParams2.height = i2;
        ViewGroup.LayoutParams layoutParams3 = this.f26263OooOOoo.getLayoutParams();
        int i3 = this.f26287OoooO;
        layoutParams3.width = i3;
        layoutParams3.height = i3;
        ViewGroup.LayoutParams layoutParams4 = this.f26266OooOo00.getLayoutParams();
        int i4 = this.f26287OoooO;
        layoutParams4.width = i4;
        layoutParams4.height = i4;
        ViewGroup.LayoutParams layoutParams5 = this.f26265OooOo0.getLayoutParams();
        int i5 = this.f26287OoooO;
        layoutParams5.width = i5;
        layoutParams5.height = i5;
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, this.f26290OoooO0O);
        layoutParams6.gravity = 17;
        this.f26273OooOoo0.setLayoutParams(layoutParams6);
        this.f26262OooOOo0.setOnClickListener(this);
        this.f26261OooOOo.setOnClickListener(this);
        this.f26263OooOOoo.setOnClickListener(this);
        this.f26266OooOo00.setOnClickListener(this);
        this.f26265OooOo0.setOnClickListener(this);
        this.f26285Oooo0oO.setOnClickListener(this);
        String stringExtra = getIntent().getStringExtra("UPGRADEROOM_ROOMID");
        this.f26291OoooOO0 = stringExtra;
        if (com.code.android.util.OooOo00.OooO0O0(stringExtra)) {
            String str = this.f26291OoooOO0;
            com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 oooO0O0 = new com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(this) { // from class: com.yalla.yalla.ui.activity.room.UpgradeRoomActivity.2
                @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
                public final void OooO0o0(String str2) {
                    List<T> list;
                    CommonListResult commonListResult = (CommonListResult) oOOO00.OooO0O0(str2, new TypeToken<CommonListResult<CreateBarModel.CreatBarMemoy>>() { // from class: com.yalla.yalla.ui.activity.room.UpgradeRoomActivity.2.1
                    }.getType());
                    if (commonListResult == null || (list = commonListResult.data) == 0 || list.size() <= 0) {
                        return;
                    }
                    List list2 = commonListResult.data;
                    UpgradeRoomActivity upgradeRoomActivity = UpgradeRoomActivity.this;
                    upgradeRoomActivity.f26292OoooOOO = list2;
                    UpgradeRoomActivity.OooOo0(upgradeRoomActivity, commonListResult.bartype);
                    int i6 = commonListResult.bartype;
                    upgradeRoomActivity.OooOo0o(i6 != 5 ? i6 + 1 : 5, true);
                }
            };
            LinkedHashMap linkedHashMapOooO00o = p426o0OoO0o0.OooOOOO.OooO00o();
            linkedHashMapOooO00o.put("barid", str);
            oooO0O0.f22926OooO0O0 = true;
            oooO0O0.f22927OooO0OO = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.loading);
            com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p384o0OOoo0O.Oooo0.f43359OooOoo, p384o0OOoo0O.Oooo0.f43377OoooO0O, linkedHashMapOooO00o, oooO0O0);
            this.f26285Oooo0oO.setText(p562o0oOo000.o000000.Upgrade);
            OooOOoo(p562o0oOo000.o000000.title_activity_upbar);
            this.f26289OoooO00.setVisibility(8);
        }
    }
}
