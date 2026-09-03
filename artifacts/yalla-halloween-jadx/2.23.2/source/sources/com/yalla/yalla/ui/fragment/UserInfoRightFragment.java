package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.android.material.internal.FlowLayout;
import com.yalla.yalla.model.user.UserInfoModel;
import com.zego.zegoavkit2.ZegoConstants;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import p590o0oOooo0.oOO0O0;

/* JADX INFO: loaded from: classes4.dex */
public class UserInfoRightFragment extends com.yalla.yalla.base.fragment.OooO00o {
    FlowLayout flTag;
    ImageView ivUserConstellation;
    TextView tvTagHint;
    TextView tvUserConstellation;
    TextView tvUserLanguage;
    TextView tvUserTime;

    private void initView() {
        this.tvUserLanguage = (TextView) this.rootView.findViewById(p562o0oOo000.o0OO00O.tv_user_language);
        this.tvUserConstellation = (TextView) this.rootView.findViewById(p562o0oOo000.o0OO00O.tv_user_constellation);
        this.tvUserTime = (TextView) this.rootView.findViewById(p562o0oOo000.o0OO00O.tv_userinfo_time);
        this.ivUserConstellation = (ImageView) this.rootView.findViewById(p562o0oOo000.o0OO00O.iv_user_constellation);
        this.flTag = (FlowLayout) this.rootView.findViewById(p562o0oOo000.o0OO00O.fl_userinfo_tag);
        this.tvTagHint = (TextView) this.rootView.findViewById(p562o0oOo000.o0OO00O.tv_userinfo_tag_hint);
    }

    public static UserInfoRightFragment newInstantce() {
        UserInfoRightFragment userInfoRightFragment = new UserInfoRightFragment();
        userInfoRightFragment.setArguments(new Bundle());
        return userInfoRightFragment;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.rootView = layoutInflater.inflate(p562o0oOo000.oo0o0Oo.user_fragment_userinfo_right, viewGroup, false);
        initView();
        return this.rootView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    public void updataInfo(UserInfoModel userInfoModel) {
        FlowLayout flowLayout;
        Date time;
        int i;
        if (userInfoModel == null || isDetached() || (flowLayout = this.flTag) == null) {
            return;
        }
        flowLayout.removeAllViews();
        if (!com.code.android.util.OooOo00.OooO0O0(userInfoModel.getTags()) || getContext() == null) {
            this.tvTagHint.setVisibility(0);
        } else {
            this.tvTagHint.setVisibility(8);
            for (int i2 = 0; i2 < userInfoModel.getTags().size(); i2++) {
                View viewInflate = View.inflate(getContext(), p562o0oOo000.oo0o0Oo.item_flow_tag_userinfo, null);
                ((TextView) viewInflate.findViewById(p562o0oOo000.o0OO00O.tv_tag_flow_userinfo)).setText(userInfoModel.getTags().get(i2).getTagName());
                this.flTag.addView(viewInflate);
            }
        }
        this.tvUserTime.setText(userInfoModel.getRegTime() + ZegoConstants.ZegoVideoDataAuxPublishingStream + com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.days));
        switch (userInfoModel.getRegion()) {
            case 0:
                this.tvUserLanguage.setText(p562o0oOo000.o000000.English);
                break;
            case 1:
                this.tvUserLanguage.setText(p562o0oOo000.o000000.Arabic);
                break;
            case 2:
                this.tvUserLanguage.setText(p562o0oOo000.o000000.Turkish);
                break;
            case 3:
                this.tvUserLanguage.setText(p562o0oOo000.o000000.Indonesia);
                break;
            case 4:
            default:
                this.tvUserLanguage.setText("");
                break;
            case 5:
                this.tvUserLanguage.setText(p562o0oOo000.o000000.Portuguese);
                break;
            case 6:
                this.tvUserLanguage.setText(p562o0oOo000.o000000.Spanish);
                break;
            case 7:
                this.tvUserLanguage.setText(p562o0oOo000.o000000.Hindi);
                break;
            case 8:
                this.tvUserLanguage.setText(p562o0oOo000.o000000.Urdu);
                break;
        }
        try {
            time = new SimpleDateFormat("yyyy-MM-dd").parse(userInfoModel.getBirthday());
        } catch (Exception unused) {
            time = Calendar.getInstance().getTime();
        }
        int month = time.getMonth() + 1;
        int date = time.getDate();
        int i3 = month - 1;
        int i4 = oOO0O0.f57197OooOOO0[i3];
        int[] iArr = oOO0O0.f57196OooOOO;
        String strOooO0OO = com.code.android.util.o0000.OooO0OO(date < i4 ? iArr[i3] : iArr[month]);
        if (getContext() != null) {
            ImageView imageView = this.ivUserConstellation;
            Context context = getContext();
            if (strOooO0OO.equals(context.getString(oOO0O0.f57185OooO00o))) {
                i = p562o0oOo000.o0Oo0oo.aries;
            } else if (strOooO0OO.equals(context.getString(oOO0O0.f57186OooO0O0))) {
                i = p562o0oOo000.o0Oo0oo.taurus;
            } else if (strOooO0OO.equals(context.getString(oOO0O0.f57187OooO0OO))) {
                i = p562o0oOo000.o0Oo0oo.gemini;
            } else if (strOooO0OO.equals(context.getString(oOO0O0.f57188OooO0Oo))) {
                i = p562o0oOo000.o0Oo0oo.cancer;
            } else if (strOooO0OO.equals(context.getString(oOO0O0.f57190OooO0o0))) {
                i = p562o0oOo000.o0Oo0oo.leo;
            } else if (strOooO0OO.equals(context.getString(oOO0O0.f57189OooO0o))) {
                i = p562o0oOo000.o0Oo0oo.virgo;
            } else if (strOooO0OO.equals(context.getString(oOO0O0.f57191OooO0oO))) {
                i = p562o0oOo000.o0Oo0oo.libra;
            } else if (strOooO0OO.equals(context.getString(oOO0O0.f57192OooO0oo))) {
                i = p562o0oOo000.o0Oo0oo.scorpio;
            } else if (strOooO0OO.equals(context.getString(oOO0O0.f57184OooO))) {
                i = p562o0oOo000.o0Oo0oo.sagittarius;
            } else if (strOooO0OO.equals(context.getString(oOO0O0.f57193OooOO0))) {
                i = p562o0oOo000.o0Oo0oo.capricorn;
            } else if (strOooO0OO.equals(context.getString(oOO0O0.f57194OooOO0O))) {
                i = p562o0oOo000.o0Oo0oo.aquarius;
            } else {
                i = strOooO0OO.equals(context.getString(oOO0O0.f57195OooOO0o)) ? p562o0oOo000.o0Oo0oo.pisces : p562o0oOo000.o0Oo0oo.pisces;
            }
            imageView.setImageResource(i);
            this.ivUserConstellation.setVisibility(0);
        }
        this.tvUserConstellation.setText(strOooO0OO.trim());
        this.tvUserConstellation.setHint("");
    }
}
