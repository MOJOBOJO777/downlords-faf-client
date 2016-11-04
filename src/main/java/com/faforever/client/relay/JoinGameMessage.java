package com.faforever.client.relay;

import com.faforever.client.remote.domain.MessageTarget;

public class JoinGameMessage extends GpgServerMessage implements Cloneable {

  private static final int USERNAME_INDEX = 0;
  private static final int PEER_UID_INDEX = 1;

  public JoinGameMessage() {
    super(GpgServerMessageType.JOIN_GAME, 2);
    setTarget(MessageTarget.GAME);
  }

  public String getUsername() {
    return getString(USERNAME_INDEX);
  }

  public void setUsername(String username) {
    setValue(USERNAME_INDEX, username);
  }

  public int getPeerUid() {
    return getInt(PEER_UID_INDEX);
  }

  public void setPeerUid(int peerUid) {
    setValue(PEER_UID_INDEX, peerUid);
  }
}
