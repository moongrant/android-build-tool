package com.twitter.sdk.android.tweetui;

import android.os.Handler;
import android.text.TextUtils;
import com.twitter.sdk.android.core.TwitterAuthException;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.models.HashtagEntity;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.core.models.MentionEntity;
import com.twitter.sdk.android.core.models.SymbolEntity;
import com.twitter.sdk.android.core.models.UrlEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000oo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Handler f21976OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final com.twitter.sdk.android.core.o0OoOo0<com.twitter.sdk.android.core.o0OOO0o> f21977OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final com.twitter.sdk.android.core.o0ooOOo f21975OooO00o = com.twitter.sdk.android.core.o0ooOOo.OooO0OO();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final p190o00o0O.OooOo00<Long, com.twitter.sdk.android.core.models.OooOo> f21978OooO0Oo = new p190o00o0O.OooOo00<>(20);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final p190o00o0O.OooOo00<Long, OooOO0O> f21979OooO0o0 = new p190o00o0O.OooOo00<>(20);

    public class OooO00o extends com.twitter.sdk.android.core.OooO0O0<com.twitter.sdk.android.core.models.OooOo> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final com.twitter.sdk.android.core.OooO0O0<com.twitter.sdk.android.core.models.OooOo> f21980OooO00o;

        public OooO00o(OooO oooO) {
            this.f21980OooO00o = oooO;
        }

        @Override // com.twitter.sdk.android.core.OooO0O0
        public final void OooO0OO(TwitterException twitterException) {
            this.f21980OooO00o.OooO0OO(twitterException);
        }

        @Override // com.twitter.sdk.android.core.OooO0O0
        public final void OooO0Oo(com.twitter.sdk.android.core.Oooo0<com.twitter.sdk.android.core.models.OooOo> oooo0) {
            com.twitter.sdk.android.core.models.OooOo oooOo = oooo0.f21502OooO00o;
            o0000oo.this.f21978OooO0Oo.put(Long.valueOf(oooOo.f21593OooO), oooOo);
            com.twitter.sdk.android.core.OooO0O0<com.twitter.sdk.android.core.models.OooOo> oooO0O0 = this.f21980OooO00o;
            if (oooO0O0 != null) {
                oooO0O0.OooO0Oo(new com.twitter.sdk.android.core.Oooo0<>(oooOo, oooo0.f21503OooO0O0));
            }
        }
    }

    public o0000oo(Handler handler, com.twitter.sdk.android.core.OooOO0O oooOO0O) {
        this.f21976OooO0O0 = handler;
        this.f21977OooO0OO = oooOO0O;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x01eb  */
    public final OooOO0O OooO00o(com.twitter.sdk.android.core.models.OooOo oooOo) {
        p190o00o0O.OooOo00<Long, OooOO0O> oooOo00;
        p190o00o0O.OooOo00<Long, OooOO0O> oooOo01;
        String str;
        int i;
        int iIntValue;
        if (oooOo == null) {
            return null;
        }
        p190o00o0O.OooOo00<Long, OooOO0O> oooOo02 = this.f21979OooO0o0;
        OooOO0O oooOO0O = oooOo02.get(Long.valueOf(oooOo.f21593OooO));
        if (oooOO0O != null) {
            return oooOO0O;
        }
        OooOO0O oooOO0O2 = new OooOO0O();
        com.twitter.sdk.android.core.models.Oooo0 oooo0 = oooOo.f21597OooO0Oo;
        ArrayList arrayList = oooOO0O2.f21832OooO0o;
        ArrayList arrayList2 = oooOO0O2.f21833OooO0o0;
        ArrayList arrayList3 = oooOO0O2.f21831OooO0Oo;
        ArrayList arrayList4 = oooOO0O2.f21830OooO0OO;
        ArrayList arrayList5 = oooOO0O2.f21829OooO0O0;
        if (oooo0 != null) {
            List<UrlEntity> list = oooo0.f21639OooO00o;
            if (list != null) {
                for (UrlEntity urlEntity : list) {
                    arrayList5.add(new OooOOO0(urlEntity.f21681OooO0oO, urlEntity.f21680OooO0o0, urlEntity.OooO0O0(), urlEntity.OooO00o(), urlEntity.f21679OooO0o));
                }
            }
            List<MediaEntity> list2 = oooOo.f21597OooO0Oo.f21641OooO0OO;
            if (list2 != null) {
                Iterator<MediaEntity> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList4.add(new OooOO0(it.next()));
                }
            }
            List<HashtagEntity> list3 = oooOo.f21597OooO0Oo.f21642OooO0Oo;
            if (list3 != null) {
                for (HashtagEntity hashtagEntity : list3) {
                    String str2 = String.format(Locale.US, "https://twitter.com/hashtag/%s?ref_src=twsrc%%5Etwitterkit", hashtagEntity.f21551OooO0o0);
                    arrayList3.add(new OooOOO0("#" + hashtagEntity.f21551OooO0o0, str2, hashtagEntity.OooO0O0(), hashtagEntity.OooO00o(), str2));
                }
            }
            List<MentionEntity> list4 = oooOo.f21597OooO0Oo.f21640OooO0O0;
            if (list4 != null) {
                for (MentionEntity mentionEntity : list4) {
                    String strOooO00o = o000.OooO00o(mentionEntity.f21572OooO0oo);
                    arrayList2.add(new OooOOO0("@" + mentionEntity.f21572OooO0oo, strOooO00o, mentionEntity.OooO0O0(), mentionEntity.OooO00o(), strOooO00o));
                }
            }
            List<SymbolEntity> list5 = oooOo.f21597OooO0Oo.f21643OooO0o0;
            if (list5 != null) {
                for (SymbolEntity symbolEntity : list5) {
                    String str3 = String.format(Locale.US, "https://twitter.com/search?q=%%24%s&ref_src=twsrc%%5Etwitterkit", symbolEntity.f21678OooO0o0);
                    arrayList.add(new OooOOO0("$" + symbolEntity.f21678OooO0o0, str3, symbolEntity.OooO0O0(), symbolEntity.OooO00o(), str3));
                }
            }
        }
        if (TextUtils.isEmpty(oooOo.f21619OooOoOO)) {
            oooOo00 = oooOo02;
        } else {
            p352o0OOOo0.OooOOO0 oooOOO0 = p352o0OOOo0.OooOOO0.f42872OooO0O0;
            String str4 = oooOo.f21619OooOoOO;
            oooOOO0.getClass();
            int length = str4.length();
            StringBuilder sb = new StringBuilder(length);
            ArrayList arrayList6 = new ArrayList(5);
            int i2 = 0;
            while (i2 < length) {
                char cCharAt = str4.charAt(i2);
                if (cCharAt == '&') {
                    int i3 = i2 + 1;
                    i = length;
                    oooOo01 = oooOo02;
                    int iIndexOf = str4.indexOf(59, i3);
                    if (iIndexOf == -1) {
                        sb.append(cCharAt);
                        str = str4;
                    } else {
                        String strSubstring = str4.substring(i3, iIndexOf);
                        int length2 = strSubstring.length();
                        str = str4;
                        if (length2 <= 0) {
                            iIntValue = -1;
                        } else if (strSubstring.charAt(0) != '#' || length2 <= 1) {
                            Object obj = oooOOO0.f42876OooO00o.f42877OooO00o.get(strSubstring);
                            if (obj == null) {
                                iIntValue = -1;
                            } else {
                                iIntValue = ((Integer) obj).intValue();
                            }
                        } else {
                            char cCharAt2 = strSubstring.charAt(1);
                            if (cCharAt2 != 'x' && cCharAt2 != 'X') {
                                try {
                                    iIntValue = Integer.parseInt(strSubstring.substring(1));
                                } catch (Exception unused) {
                                    iIntValue = -1;
                                }
                            } else if (length2 > 2) {
                                iIntValue = Integer.valueOf(strSubstring.substring(2), 16).intValue();
                            } else {
                                iIntValue = -1;
                            }
                        }
                        if (iIntValue == -1) {
                            sb.append(Typography.amp);
                            if (strSubstring.indexOf(38) == -1) {
                                sb.append(strSubstring);
                                sb.append(';');
                            }
                        } else {
                            sb.append((char) iIntValue);
                            arrayList6.add(new int[]{i2, iIndexOf});
                        }
                        i2 = iIndexOf;
                    }
                } else {
                    oooOo01 = oooOo02;
                    str = str4;
                    i = length;
                    sb.append(cCharAt);
                }
                i2++;
                str4 = str;
                length = i;
                oooOo02 = oooOo01;
            }
            oooOo00 = oooOo02;
            StringBuilder sb2 = new StringBuilder(sb.toString());
            o0000O.OooO0O0(arrayList5, arrayList6);
            o0000O.OooO0O0(arrayList4, arrayList6);
            o0000O.OooO0O0(arrayList3, arrayList6);
            o0000O.OooO0O0(arrayList2, arrayList6);
            o0000O.OooO0O0(arrayList, arrayList6);
            ArrayList arrayList7 = new ArrayList();
            int length3 = sb2.length() - 1;
            for (int i4 = 0; i4 < length3; i4++) {
                if (Character.isHighSurrogate(sb2.charAt(i4)) && Character.isLowSurrogate(sb2.charAt(i4 + 1))) {
                    arrayList7.add(Integer.valueOf(i4));
                }
            }
            o0000O.OooO00o(arrayList5, arrayList7);
            o0000O.OooO00o(arrayList4, arrayList7);
            o0000O.OooO00o(arrayList3, arrayList7);
            o0000O.OooO00o(arrayList2, arrayList7);
            o0000O.OooO00o(arrayList, arrayList7);
            oooOO0O2.f21828OooO00o = sb2.toString();
        }
        if (!TextUtils.isEmpty(oooOO0O2.f21828OooO00o)) {
            oooOo00.put(Long.valueOf(oooOo.f21593OooO), oooOO0O2);
        }
        return oooOO0O2;
    }

    public final void OooO0O0(Oooo0 oooo0) {
        com.twitter.sdk.android.core.o0OOO0o o0ooo0o2 = (com.twitter.sdk.android.core.o0OOO0o) ((com.twitter.sdk.android.core.OooOO0O) this.f21977OooO0OO).OooO0OO();
        if (o0ooo0o2 == null) {
            oooo0.OooO0OO(new TwitterAuthException("User authorization required"));
        } else {
            oooo0.OooO0Oo(new com.twitter.sdk.android.core.Oooo0(o0ooo0o2, null));
        }
    }
}
