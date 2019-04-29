TMP=tmp
GIT_COMMIT=723a3e83a5cc6633003c71f55de3d9980f2f690c
GITHUB_API_USER=thomas-vogel444
GITHUB_API_TOKEN=90ecf2f78fd29891fd2e246df5e92d36d64955ee

RELEASE_NAME="$(head -n 1 "$TMP/RELEASE_VERSION_v2_5"), $(head -n 1 "$TMP/RELEASE_VERSION_v2_6")"
RELEASE_VERSION=$(head -n 1 "$TMP/RELEASE_VERSION_v2_5" | cut -d'-' -f 1)

# git clone https://$GITHUB_API_USER:$GITHUB_API_TOKEN@github.com/hmrc/tagger.git

echo "release name: $RELEASE_NAME"
echo "release version: $RELEASE_VERSION"

pip --quiet install -r tagger/requirements.txt

python tagger/tagger.py platops-example-play-cross-compiled-library $GIT_COMMIT $RELEASE_VERSION "$RELEASE_NAME" $GITHUB_API_USER $GITHUB_API_TOKEN