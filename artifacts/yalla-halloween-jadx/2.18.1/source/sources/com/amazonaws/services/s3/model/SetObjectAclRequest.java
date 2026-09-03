package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class SetObjectAclRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final String f10932Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final CannedAccessControlList f10933OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final String f10934OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final String f10935OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final AccessControlList f10936OoooO0O;

    public SetObjectAclRequest(String str, String str2, String str3, AccessControlList accessControlList) {
        this.f10932Oooo = str;
        this.f10935OoooO00 = str2;
        this.f10934OoooO0 = str3;
        this.f10936OoooO0O = accessControlList;
        this.f10933OoooO = null;
    }

    public SetObjectAclRequest(String str, String str2, String str3, CannedAccessControlList cannedAccessControlList) {
        this.f10932Oooo = str;
        this.f10935OoooO00 = str2;
        this.f10934OoooO0 = str3;
        this.f10936OoooO0O = null;
        this.f10933OoooO = cannedAccessControlList;
    }
}
