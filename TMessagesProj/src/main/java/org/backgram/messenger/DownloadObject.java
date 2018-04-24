/*
 * This is the source code of Backgram for Android v. 3.x.x.
 * It is licensed under GNU GPL v. 2 or later.
 * You should have received a copy of the license in this archive (see LICENSE).
 *
 * Copyright Nikolai Kudashov, 2013-2017.
 */

package org.backgram.messenger;

import org.backgram.tgnet.TLObject;

public class DownloadObject {
    public TLObject object;
    public int type;
    public long id;
    public boolean secret;
}
